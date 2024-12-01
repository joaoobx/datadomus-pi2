package br.com.datadomus.modules.warnings.usecases.updatewarning;

import br.com.datadomus.modules.warnings.entities.Warning;
import br.com.datadomus.modules.warnings.usecases.updatewarning.dtos.UpdateWarningRequestDTO;
import br.com.datadomus.modules.warnings.usecases.updatewarning.dtos.UpdateWarningResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateWarningController {

    final UpdateWarningService updateWarningService;

    public UpdateWarningController(UpdateWarningService updateWarningService) {
        this.updateWarningService = updateWarningService;
    }

    @PutMapping("/warning/update")
    public ResponseEntity<UpdateWarningResponseDTO> execute(@Valid @RequestBody UpdateWarningRequestDTO request) {

        Warning warning = updateWarningService.execute(request);

        return ResponseEntity.ok(new UpdateWarningResponseDTO(warning));
    }
}
