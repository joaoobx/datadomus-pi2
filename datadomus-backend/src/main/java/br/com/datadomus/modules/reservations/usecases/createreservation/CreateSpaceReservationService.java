package br.com.datadomus.modules.reservations.usecases.createreservation;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import br.com.datadomus.modules.reservations.repositories.SpaceReservationRepository;
import br.com.datadomus.modules.reservations.usecases.createreservation.dtos.CreateSpaceReservationRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class CreateSpaceReservationService {

    final SpaceReservationRepository spaceReservationRepository;

    public CreateSpaceReservationService(SpaceReservationRepository spaceReservationRepository) {
        this.spaceReservationRepository = spaceReservationRepository;
    }

    SpaceReservation execute(CreateSpaceReservationRequestDTO request){

        return this.spaceReservationRepository.save(new SpaceReservation(request));

    }

}
