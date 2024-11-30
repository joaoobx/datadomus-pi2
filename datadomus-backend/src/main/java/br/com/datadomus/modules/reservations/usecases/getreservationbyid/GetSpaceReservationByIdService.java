package br.com.datadomus.modules.reservations.usecases.getreservationbyid;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import br.com.datadomus.modules.reservations.repositories.SpaceReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class GetSpaceReservationByIdService {

    final SpaceReservationRepository spaceReservationRepository;

    public GetSpaceReservationByIdService(SpaceReservationRepository spaceReservationRepository) {
        this.spaceReservationRepository = spaceReservationRepository;
    }

    SpaceReservation execute(Long id){

        try {

            return this.spaceReservationRepository.findById(id).orElseThrow();

        } catch (Exception exception) {
            throw new RuntimeException("Reserva de espaço não encontrada");
        }

    }

}
