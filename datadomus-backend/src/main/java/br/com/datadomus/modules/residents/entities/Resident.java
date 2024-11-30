package br.com.datadomus.modules.residents.entities;

import br.com.datadomus.modules.residents.usecases.createresident.dtos.CreateResidentRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "residents")
@NoArgsConstructor
public class Resident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String id;

    @Column(name = "registration_date")
    protected String registrationDate = "";

    @Column(name = "resident_name")
    protected String residentName = "";

    @Column(name = "apartment_number")
    protected Integer apartmentNumber = null;

    @Column(name = "telephone_1")
    protected String telephone1 = "";

    @Column(name = "telephone_2")
    protected String telephone2 = "";

    @Column(name = "email")
    protected String email = "";

    @Column(name = "observartions")
    protected String observations = "";

    public Resident(CreateResidentRequestDTO createResidentRequestDTO) {
        this.apartmentNumber = createResidentRequestDTO.getApartmentNumber();
        this.email = createResidentRequestDTO.getEmail();
        this.residentName = createResidentRequestDTO.getResidentName();
        this.telephone1 = createResidentRequestDTO.getTelephone1();
        this.telephone2 = createResidentRequestDTO.getTelephone2();
        this.observations = createResidentRequestDTO.getObservations();
        this.registrationDate = createResidentRequestDTO.getRegistrationDate();
    }

}

