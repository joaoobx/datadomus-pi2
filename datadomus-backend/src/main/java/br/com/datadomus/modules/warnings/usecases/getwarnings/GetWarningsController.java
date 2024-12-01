package br.com.datadomus.modules.warnings.usecases.getwarnings;

import br.com.datadomus.modules.warnings.entities.Warning;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetWarningsController {

    final GetWarningsService getWarningsService;

    public GetWarningsController(GetWarningsService getWarningsService) {
        this.getWarningsService = getWarningsService;
    }

    @GetMapping("/warnings")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Warning>> execute() {

        List<Warning> warnings = getWarningsService.execute();

        return ResponseEntity.ok(warnings);
    }
}
