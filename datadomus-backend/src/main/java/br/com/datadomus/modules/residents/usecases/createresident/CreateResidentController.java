package br.com.datadomus.modules.residents.usecases.createresident;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import br.com.datadomus.modules.residents.usecases.createresident.dtos.CreateResidentRequestDTO;
import br.com.datadomus.modules.residents.usecases.createresident.dtos.CreateResidentResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateResidentController {

    @Autowired
    CreateResidentService createResidentService;

    @PostMapping("/user/create")
    public ResponseEntity<CreateResidentResponseDTO> execute(@Valid @RequestBody CreateResidentRequestDTO request) {

        Resident resident = createResidentService.execute(request);

        return ResponseEntity.ok(new CreateResidentResponseDTO(resident));
    }
}