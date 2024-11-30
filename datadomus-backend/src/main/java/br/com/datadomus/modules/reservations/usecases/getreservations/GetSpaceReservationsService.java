package br.com.datadomus.modules.reservations.usecases.getreservations;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import br.com.datadomus.modules.reservations.repositories.SpaceReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetSpaceReservationsService {

    final SpaceReservationRepository spaceReservationRepository;

    public GetSpaceReservationsService(SpaceReservationRepository spaceReservationRepository) {
        this.spaceReservationRepository = spaceReservationRepository;
    }

    List<SpaceReservation> execute(){

        try {

            return this.spaceReservationRepository.findAll();

        } catch (Exception exception) {
            throw new RuntimeException("Reservas não encontradas");
        }

    }

}
