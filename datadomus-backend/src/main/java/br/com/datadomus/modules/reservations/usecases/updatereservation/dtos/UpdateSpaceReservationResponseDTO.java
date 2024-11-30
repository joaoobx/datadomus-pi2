package br.com.datadomus.modules.reservations.usecases.updatereservation.dtos;

import br.com.datadomus.modules.reservations.entities.SpaceReservation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSpaceReservationResponseDTO {

    protected Long id;

    @JsonProperty("registration_date")
    protected String registrationDate;

    @JsonProperty("resident_name")
    protected String residentName = "";

    @JsonProperty("apartment_number")
    protected Integer apartmentNumber = null;

    @JsonProperty("Title")
    protected String title = "";

    @JsonProperty("Event_date")
    protected String eventDate = "";

    @JsonProperty("Start_time")
    protected String startTime = "";

    @JsonProperty("End_time")
    protected String endTime = "";

    @JsonProperty("Place")
    protected String place = "";

    @JsonProperty("Observations")
    protected String observations = "";

    public UpdateSpaceReservationResponseDTO(SpaceReservation spaceReservation) {
        this.id = spaceReservation.getId();
        this.registrationDate = spaceReservation.getRegistrationDate();
        this.residentName = spaceReservation.getResidentName();
        this.apartmentNumber = spaceReservation.getApartmentNumber();
        this.title = spaceReservation.getTitle();
        this.eventDate = spaceReservation.getEventDate();
        this.startTime = spaceReservation.getStartTime();
        this.endTime = spaceReservation.getEndTime();
        this.place = spaceReservation.getPlace();
        this.observations = spaceReservation.getObservations();
    }

}
