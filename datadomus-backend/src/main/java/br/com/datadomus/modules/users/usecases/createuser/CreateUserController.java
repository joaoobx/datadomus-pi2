package br.com.datadomus.modules.users.usecases.createuser;

import br.com.datadomus.modules.users.entities.User;
import br.com.datadomus.modules.users.repositories.UserRepository;
import br.com.datadomus.modules.users.usecases.createuser.dtos.CreateUserRequestDTO;
import br.com.datadomus.modules.users.usecases.createuser.dtos.CreateUserResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user/create")
    public ResponseEntity<CreateUserResponseDTO> execute(@Valid @RequestBody CreateUserRequestDTO request) {

        User user = userRepository.save(new User(request.getUserName()));

        return ResponseEntity.ok(new CreateUserResponseDTO(user));
    }
}
