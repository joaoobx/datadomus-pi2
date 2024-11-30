package br.com.datadomus.modules.reservations.entities;

import br.com.datadomus.modules.reservations.usecases.createreservation.dtos.CreateSpaceReservationRequestDTO;
import br.com.datadomus.modules.reservations.usecases.updatereservation.dtos.UpdateSpaceReservationRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "space_reservations")
@NoArgsConstructor
public class SpaceReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "registration_date")
    protected String registrationDate = "";

    @Column(name = "resident_name")
    protected String residentName = "";

    @Column(name = "apartment_number")
    protected Integer apartmentNumber = null;

    @Column(name = "Title")
    protected String title = "";

    @Column(name = "Event_date")
    protected String eventDate = "";

    @Column(name = "Start_time")
    protected String startTime = "";

    @Column(name = "End_time")
    protected String endTime = "";

    @Column(name = "Place")
    protected String place = "";

    @Column(name = "Observations")
    protected String observations = "";

    public SpaceReservation(CreateSpaceReservationRequestDTO createSpaceReservationRequestDTO) {
        this.registrationDate = createSpaceReservationRequestDTO.getRegistrationDate();
        this.residentName = createSpaceReservationRequestDTO.getResidentName();
        this.apartmentNumber = createSpaceReservationRequestDTO.getApartmentNumber();
        this.title = createSpaceReservationRequestDTO.getTitle();
        this.eventDate = createSpaceReservationRequestDTO.getEventDate();
        this.startTime = createSpaceReservationRequestDTO.getStartTime();
        this.endTime = createSpaceReservationRequestDTO.getEndTime();
        this.place = createSpaceReservationRequestDTO.getPlace();
        this.observations = createSpaceReservationRequestDTO.getObservations();
    }

    public SpaceReservation(UpdateSpaceReservationRequestDTO updateSpaceReservationRequestDTO) {
        this.id = updateSpaceReservationRequestDTO.getId();
        this.residentName = updateSpaceReservationRequestDTO.getResidentName();
        this.apartmentNumber = updateSpaceReservationRequestDTO.getApartmentNumber();
        this.title = updateSpaceReservationRequestDTO.getTitle();
        this.eventDate = updateSpaceReservationRequestDTO.getEventDate();
        this.startTime = updateSpaceReservationRequestDTO.getStartTime();
        this.endTime = updateSpaceReservationRequestDTO.getEndTime();
        this.place = updateSpaceReservationRequestDTO.getPlace();
        this.observations = updateSpaceReservationRequestDTO.getObservations();
    }

}

