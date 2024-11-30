package br.com.datadomus.modules.reservations.usecases.deletereservation;
import br.com.datadomus.modules.reservations.repositories.SpaceReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteSpaceReservationService {

    final SpaceReservationRepository spaceReservationRepository;

    public DeleteSpaceReservationService(SpaceReservationRepository spaceReservationRepository) {
        this.spaceReservationRepository = spaceReservationRepository;
    }

    void execute(Long id){

        try {

            this.spaceReservationRepository.deleteById(id);

        } catch (Exception exception) {
            throw new RuntimeException("Reserva de espaço não encontrada");
        }

    }

}
