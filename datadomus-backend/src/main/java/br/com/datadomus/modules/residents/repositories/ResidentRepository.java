package br.com.datadomus.modules.residents.repositories;

import br.com.datadomus.modules.residents.entities.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident, Long> {
}
