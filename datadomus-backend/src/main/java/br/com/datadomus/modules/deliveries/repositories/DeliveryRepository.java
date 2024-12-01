package br.com.datadomus.modules.deliveries.repositories;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
