package br.com.datadomus.modules.warnings.repositories;

import br.com.datadomus.modules.warnings.entities.Warning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarningRepository extends JpaRepository<Warning, Long> {
}
