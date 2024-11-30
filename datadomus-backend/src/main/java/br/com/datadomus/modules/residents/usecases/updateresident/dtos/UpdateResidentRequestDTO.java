package br.com.datadomus.modules.residents.usecases.updateresident.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateResidentRequestDTO {

    @NotNull(message = "O campo 'id' não está presente ")
    protected Integer id;

    @NotBlank(message = "O campo 'registration_date' deve ser preenchido")
    @NotNull(message = "O campo 'registration_date' não está presente ")
    @JsonProperty("registration_date")
    protected String registrationDate;

    @NotBlank(message = "O campo 'resident_name' deve ser preenchido")
    @NotNull(message = "O campo 'resident_name' não está presente ")
    @JsonProperty("resident_name")
    protected String residentName;

    @NotNull(message = "O campo 'Apartment_number' não está presente ")
    @JsonProperty("Apartment_number")
    protected Integer apartmentNumber;

    @NotBlank(message = "O campo 'Telephone1' deve ser preenchido")
    @NotNull(message = "O campo 'Telephone1' não está presente ")
    @JsonProperty("Telephone1")
    protected String telephone1;

    @NotBlank(message = "O campo 'Telephone2' deve ser preenchido")
    @NotNull(message = "O campo 'Telephone2' não está presente ")
    @JsonProperty("Telephone2")
    protected String telephone2;

    @NotBlank(message = "O campo 'Email' deve ser preenchido")
    @NotNull(message = "O campo 'Email' não está presente ")
    @JsonProperty("Email")
    protected String email;

    @NotBlank(message = "O campo 'Observations' deve ser preenchido")
    @NotNull(message = "O campo 'Observations' não está presente ")
    @JsonProperty("Observations")
    protected String observations;

}
