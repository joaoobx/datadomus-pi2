package br.com.datadomus.modules.warnings.usecases.createwarning.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateWarningRequestDTO {

    @NotBlank(message = "O campo 'registration_date' deve ser preenchido")
    @NotNull(message = "O campo 'registration_date' não está presente ")
    @JsonProperty("registration_date")
    protected String registrationDate;

    @NotBlank(message = "O campo 'expiration_date' deve ser preenchido")
    @NotNull(message = "O campo 'expiration_date' não está presente ")
    @JsonProperty("expiration_date")
    protected String expirationDate = "";

    @NotBlank(message = "O campo 'Title' deve ser preenchido")
    @NotNull(message = "O campo 'Title' não está presente ")
    @JsonProperty("Title")
    protected String title = "";

    @NotBlank(message = "O campo 'warning_text' deve ser preenchido")
    @NotNull(message = "O campo 'warning_text' não está presente ")
    @JsonProperty("warning_text")
    protected String warningText = "";

    @NotBlank(message = "O campo 'File' deve ser preenchido")
    @NotNull(message = "O campo 'File' não está presente ")
    @JsonProperty("File")
    protected String file = "";

}
