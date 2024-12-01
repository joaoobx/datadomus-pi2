package br.com.datadomus.modules.warnings.entities;

import br.com.datadomus.modules.warnings.usecases.createwarning.dtos.CreateWarningRequestDTO;
import br.com.datadomus.modules.warnings.usecases.updatewarning.dtos.UpdateWarningRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "warnings")
@NoArgsConstructor
public class Warning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "registration_date")
    protected String registrationDate = "";

    @Column(name = "expiration_date")
    protected String expirationDate = "";

    @Column(name = "Title")
    protected String title = "";

    @Column(name = "warning_text", columnDefinition="TEXT")
    protected String warningText = "";

    @Column(name = "File")
    protected String file = "";

    public Warning(CreateWarningRequestDTO createWarningRequestDTO) {
        this.registrationDate = createWarningRequestDTO.getRegistrationDate();
        this.expirationDate = createWarningRequestDTO.getExpirationDate();
        this.title = createWarningRequestDTO.getTitle();
        this.warningText = createWarningRequestDTO.getWarningText();
        this.file = createWarningRequestDTO.getFile();
    }

    public Warning(UpdateWarningRequestDTO updateWarningRequestDTO) {
        this.id = updateWarningRequestDTO.getId();
        this.registrationDate = updateWarningRequestDTO.getRegistrationDate();
        this.expirationDate = updateWarningRequestDTO.getExpirationDate();
        this.title = updateWarningRequestDTO.getTitle();
        this.warningText = updateWarningRequestDTO.getWarningText();
        this.file = updateWarningRequestDTO.getFile();
    }

}

