package br.com.datadomus.modules.warnings.usecases.getwarningbyid.dtos;

import br.com.datadomus.modules.warnings.entities.Warning;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetWarningByIdResponseDTO {

    protected Long id;

    @JsonProperty("registration_date")
    protected String registrationDate;

    @JsonProperty("expiration_date")
    protected String expirationDate;

    @JsonProperty("Title")
    protected String title;

    @JsonProperty("warning_text")
    protected String warningText;

    @JsonProperty("File")
    protected String file;

    public GetWarningByIdResponseDTO(Warning warning) {
        this.id = warning.getId();
        this.registrationDate = warning.getRegistrationDate();
        this.expirationDate = warning.getExpirationDate();
        this.title = warning.getTitle();
        this.warningText = warning.getWarningText();
        this.file = warning.getFile();
    }

}
