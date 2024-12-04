package br.com.datadomus.modules.residents.entities;

import br.com.datadomus.modules.residents.usecases.createresident.dtos.CreateResidentRequestDTO;
import br.com.datadomus.modules.residents.usecases.updateresident.dtos.UpdateResidentRequestDTO;
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
    protected Long id;

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

    @Column(name = "observartions")
    protected String password = "";

    public Resident(CreateResidentRequestDTO createResidentRequestDTO) {
        this.apartmentNumber = createResidentRequestDTO.getApartmentNumber();
        this.email = createResidentRequestDTO.getEmail();
        this.residentName = createResidentRequestDTO.getResidentName();
        this.telephone1 = createResidentRequestDTO.getTelephone1();
        this.telephone2 = createResidentRequestDTO.getTelephone2();
        this.observations = createResidentRequestDTO.getObservations();
        this.registrationDate = createResidentRequestDTO.getRegistrationDate();
        this.password = createResidentRequestDTO.getPassword();
    }

    public Resident(UpdateResidentRequestDTO updateResidentRequestDTO) {
        this.id = updateResidentRequestDTO.getId();
        this.apartmentNumber = updateResidentRequestDTO.getApartmentNumber();
        this.email = updateResidentRequestDTO.getEmail();
        this.residentName = updateResidentRequestDTO.getResidentName();
        this.telephone1 = updateResidentRequestDTO.getTelephone1();
        this.telephone2 = updateResidentRequestDTO.getTelephone2();
        this.observations = updateResidentRequestDTO.getObservations();
        this.registrationDate = updateResidentRequestDTO.getRegistrationDate();
        this.password = updateResidentRequestDTO.getPassword();
    }

}

