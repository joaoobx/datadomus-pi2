package br.com.datadomus.modules.reservations.usecases.getreservations;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetSpaceReservationsController {

    final GetSpaceReservationsService getSpaceReservationsService;

    public GetSpaceReservationsController(GetSpaceReservationsService getSpaceReservationsService) {
        this.getSpaceReservationsService = getSpaceReservationsService;
    }

    @GetMapping("/reservations")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<SpaceReservation>> execute() {

        List<SpaceReservation> spaceReservations = getSpaceReservationsService.execute();

        return ResponseEntity.ok(spaceReservations);
    }
}
