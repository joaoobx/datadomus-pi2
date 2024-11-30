package br.com.datadomus.modules.reservations.repositories;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpaceReservationRepository extends JpaRepository<SpaceReservation, Long> {
}
