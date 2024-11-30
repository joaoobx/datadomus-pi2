package br.com.datadomus.modules.reservations.usecases.deletereservation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteSpaceReservationController {

    final DeleteSpaceReservationService deleteSpaceReservationService;

    public DeleteSpaceReservationController(DeleteSpaceReservationService deleteSpaceReservationService) {
        this.deleteSpaceReservationService = deleteSpaceReservationService;
    }

    @DeleteMapping("/reservation/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void execute(@PathVariable("id") Long id) {

        deleteSpaceReservationService.execute(id);

    }
}
