package br.com.datadomus.modules.residents.usecases.getresidentbyid;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.usecases.getresidentbyid.dtos.GetResidentByIdResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetResidentByIdController {

    final GetResidentByIdService getResidentByIdService;

    public GetResidentByIdController(GetResidentByIdService getResidentByIdService) {
        this.getResidentByIdService = getResidentByIdService;
    }

    @GetMapping("/resident/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GetResidentByIdResponseDTO> execute(@PathVariable("id") Long id) {

        Resident resident = getResidentByIdService.execute(id);

        return ResponseEntity.ok(new GetResidentByIdResponseDTO(resident));
    }
}
