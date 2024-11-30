package br.com.datadomus.modules.residents.usecases.getresidents;

import br.com.datadomus.modules.residents.entities.Resident;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetResidentsController {

    final GetResidentsService getResidentsService;

    public GetResidentsController(GetResidentsService getResidentsService) {
        this.getResidentsService = getResidentsService;
    }

    @GetMapping("/residents")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Resident>> execute() {

        List<Resident> residents = getResidentsService.execute();

        return ResponseEntity.ok(residents);
    }
}
