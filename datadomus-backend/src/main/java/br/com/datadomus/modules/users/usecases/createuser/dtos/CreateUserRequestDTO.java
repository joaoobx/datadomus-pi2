package br.com.datadomus.modules.users.usecases.createuser.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestDTO {

    @NotBlank(message = "O campo 'userName' deve ser preenchido")
    @NotNull(message = "O campo 'userName' não está presente ")
    protected String userName;

}
