package br.com.datadomus.modules.warnings.usecases.getwarningbyid;

import br.com.datadomus.modules.warnings.entities.Warning;
import br.com.datadomus.modules.warnings.usecases.getwarningbyid.dtos.GetWarningByIdResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetWarningByIdController {

    final GetWarningByIdService getWarningByIdService;

    public GetWarningByIdController(GetWarningByIdService getWarningByIdService) {
        this.getWarningByIdService = getWarningByIdService;
    }

    @GetMapping("/warning/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GetWarningByIdResponseDTO> execute(@PathVariable("id") Long id) {

        Warning warning = getWarningByIdService.execute(id);

        return ResponseEntity.ok(new GetWarningByIdResponseDTO(warning));
    }
}
