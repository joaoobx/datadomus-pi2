package br.com.datadomus.modules.residents.usecases.updateresident;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.usecases.updateresident.dtos.UpdateResidentRequestDTO;
import br.com.datadomus.modules.residents.usecases.updateresident.dtos.UpdateResidentResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateResidentController {

    final UpdateResidentService updateResidentService;

    public UpdateResidentController(UpdateResidentService updateResidentService) {
        this.updateResidentService = updateResidentService;
    }

    @PutMapping("/resident/update")
    public ResponseEntity<UpdateResidentResponseDTO> execute(@Valid @RequestBody UpdateResidentRequestDTO request) {

        Resident resident = updateResidentService.execute(request);

        return ResponseEntity.ok(new UpdateResidentResponseDTO(resident));
    }
}
