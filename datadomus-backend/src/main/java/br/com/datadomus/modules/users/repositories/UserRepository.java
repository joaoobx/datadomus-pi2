package br.com.datadomus.modules.users.repositories;

import br.com.datadomus.modules.users.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
