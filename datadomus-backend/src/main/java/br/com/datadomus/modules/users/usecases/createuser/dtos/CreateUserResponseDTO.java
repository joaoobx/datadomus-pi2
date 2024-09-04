package br.com.datadomus.modules.users.usecases.createuser.dtos;

import br.com.datadomus.modules.users.entities.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateUserResponseDTO {
    public CreateUserResponseDTO(User user) {
        this.userName = user.getUserName();
    }

    private final String userName;

}
