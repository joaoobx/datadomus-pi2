package br.com.datadomus.modules.reservations.usecases.updatereservation;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import br.com.datadomus.modules.reservations.usecases.updatereservation.dtos.UpdateSpaceReservationRequestDTO;
import br.com.datadomus.modules.reservations.usecases.updatereservation.dtos.UpdateSpaceReservationResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateSpaceReservationController {

    final UpdateSpaceReservationService updateSpaceReservationService;

    public UpdateSpaceReservationController(UpdateSpaceReservationService updateSpaceReservationService) {
        this.updateSpaceReservationService = updateSpaceReservationService;
    }

    @PutMapping("/reservation/update")
    public ResponseEntity<UpdateSpaceReservationResponseDTO> execute(@Valid @RequestBody UpdateSpaceReservationRequestDTO request) {

        SpaceReservation spaceReservation = updateSpaceReservationService.execute(request);

        return ResponseEntity.ok(new UpdateSpaceReservationResponseDTO(spaceReservation));
    }
}
