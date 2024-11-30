package br.com.datadomus.modules.residents.repositories;

import br.com.datadomus.modules.residents.entities.Resident;
import org.springframework.data.repository.CrudRepository;

public interface ResidentRepository extends CrudRepository<Resident, Long> {
}
