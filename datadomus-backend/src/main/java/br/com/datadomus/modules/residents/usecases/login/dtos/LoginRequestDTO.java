package br.com.datadomus.modules.residents.usecases.login.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDTO {

    @NotNull(message = "O campo 'Apartment_number' não está presente ")
    @JsonProperty("Apartment_number")
    protected Integer apartmentNumber;


    @NotBlank(message = "O campo 'password' deve ser preenchido")
    @NotNull(message = "O campo 'password' não está presente ")
    @JsonProperty("password")
    protected String password;

}
