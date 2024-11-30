package br.com.datadomus.modules.reservations.usecases.createreservation;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import br.com.datadomus.modules.reservations.usecases.createreservation.dtos.CreateSpaceReservationRequestDTO;
import br.com.datadomus.modules.reservations.usecases.createreservation.dtos.CreateSpaceReservationResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateSpaceReservationController {

    final CreateSpaceReservationService createSpaceReservationService;

    public CreateSpaceReservationController(CreateSpaceReservationService createSpaceReservationService) {
        this.createSpaceReservationService = createSpaceReservationService;
    }

    @PostMapping("/reservation/create")
    public ResponseEntity<CreateSpaceReservationResponseDTO> execute(@Valid @RequestBody CreateSpaceReservationRequestDTO request) {

        SpaceReservation spaceReservation = createSpaceReservationService.execute(request);

        return ResponseEntity.ok(new CreateSpaceReservationResponseDTO(spaceReservation));
    }
}
