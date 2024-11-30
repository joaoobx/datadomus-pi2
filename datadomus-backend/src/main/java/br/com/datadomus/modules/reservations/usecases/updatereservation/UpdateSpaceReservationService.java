package br.com.datadomus.modules.reservations.usecases.updatereservation;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import br.com.datadomus.modules.reservations.repositories.SpaceReservationRepository;
import br.com.datadomus.modules.reservations.usecases.updatereservation.dtos.UpdateSpaceReservationRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class UpdateSpaceReservationService {

    final SpaceReservationRepository spaceReservationRepository;

    public UpdateSpaceReservationService(SpaceReservationRepository spaceReservationRepository) {
        this.spaceReservationRepository = spaceReservationRepository;
    }

    SpaceReservation execute(UpdateSpaceReservationRequestDTO request){

        return this.spaceReservationRepository.save(new SpaceReservation(request));

    }

}
