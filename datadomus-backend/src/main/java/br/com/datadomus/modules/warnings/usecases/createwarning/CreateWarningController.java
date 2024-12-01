package br.com.datadomus.modules.warnings.usecases.createwarning;

import br.com.datadomus.modules.warnings.entities.Warning;
import br.com.datadomus.modules.warnings.usecases.createwarning.dtos.CreateWarningRequestDTO;
import br.com.datadomus.modules.warnings.usecases.createwarning.dtos.CreateWarningResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateWarningController {

    final CreateWarningService createWarningService;

    public CreateWarningController(CreateWarningService createWarningService) {
        this.createWarningService = createWarningService;
    }

    @PostMapping("/warning/create")
    public ResponseEntity<CreateWarningResponseDTO> execute(@Valid @RequestBody CreateWarningRequestDTO request) {

        Warning warning = createWarningService.execute(request);

        return ResponseEntity.ok(new CreateWarningResponseDTO(warning));
    }
}
