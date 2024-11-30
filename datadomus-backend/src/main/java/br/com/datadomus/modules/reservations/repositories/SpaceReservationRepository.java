package br.com.datadomus.modules.reservations.repositories;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import org.springframework.data.repository.CrudRepository;

public interface SpaceReservationRepository extends CrudRepository<SpaceReservation, Long> {
}
