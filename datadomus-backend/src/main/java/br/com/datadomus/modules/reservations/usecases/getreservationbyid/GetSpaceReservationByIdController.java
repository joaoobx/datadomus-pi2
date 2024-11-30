package br.com.datadomus.modules.reservations.usecases.getreservationbyid;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import br.com.datadomus.modules.reservations.usecases.getreservationbyid.dtos.GetSpaceReservationByIdResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetSpaceReservationByIdController {

    final GetSpaceReservationByIdService getSpaceReservationByIdService;

    public GetSpaceReservationByIdController(GetSpaceReservationByIdService getSpaceReservationByIdService) {
        this.getSpaceReservationByIdService = getSpaceReservationByIdService;
    }

    @GetMapping("/resident/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GetSpaceReservationByIdResponseDTO> execute(@PathVariable("id") Long id) {

        SpaceReservation spaceReservation = getSpaceReservationByIdService.execute(id);

        return ResponseEntity.ok(new GetSpaceReservationByIdResponseDTO(spaceReservation));
    }
}
