package br.com.datadomus.modules.reservations.usecases.updatereservation.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSpaceReservationRequestDTO {

    @NotNull(message = "O campo 'id' não está presente ")
    protected Long id;

    @NotBlank(message = "O campo 'registration_date' deve ser preenchido")
    @NotNull(message = "O campo 'registration_date' não está presente ")
    @JsonProperty("registration_date")
    protected String registrationDate;

    @NotBlank(message = "O campo 'resident_name' deve ser preenchido")
    @NotNull(message = "O campo 'resident_name' não está presente ")
    @JsonProperty("resident_name")
    protected String residentName = "";

    @NotNull(message = "O campo 'Apartment_number' não está presente ")
    @JsonProperty("Apartment_number")
    protected Integer apartmentNumber = null;

    @NotBlank(message = "O campo 'Title' deve ser preenchido")
    @NotNull(message = "O campo 'Title' não está presente ")
    @JsonProperty("Title")
    protected String title = "";

    @NotBlank(message = "O campo 'Event_date' deve ser preenchido")
    @NotNull(message = "O campo 'Event_date' não está presente ")
    @JsonProperty("Event_date")
    protected String eventDate = "";

    @NotBlank(message = "O campo 'Start_time' deve ser preenchido")
    @NotNull(message = "O campo 'Start_time' não está presente ")
    @JsonProperty("Start_time")
    protected String startTime = "";

    @NotBlank(message = "O campo 'End_time' deve ser preenchido")
    @NotNull(message = "O campo 'End_time' não está presente ")
    @JsonProperty("End_time")
    protected String endTime = "";

    @NotBlank(message = "O campo 'Place' deve ser preenchido")
    @NotNull(message = "O campo 'Place' não está presente ")
    @JsonProperty("Place")
    protected String place = "";

    @NotBlank(message = "O campo 'Observations' deve ser preenchido")
    @NotNull(message = "O campo 'Observations' não está presente ")
    @JsonProperty("Observations")
    protected String observations = "";

}
