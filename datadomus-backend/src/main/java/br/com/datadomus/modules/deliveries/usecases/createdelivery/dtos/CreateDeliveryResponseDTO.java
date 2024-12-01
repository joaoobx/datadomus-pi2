package br.com.datadomus.modules.deliveries.usecases.createdelivery.dtos;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateDeliveryResponseDTO {

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

    public CreateDeliveryResponseDTO(Delivery delivery) {
        this.id = delivery.getId();
        this.registrationDate = delivery.getRegistrationDate();
        this.expirationDate = delivery.getExpirationDate();
        this.title = delivery.getTitle();
        this.warningText = delivery.getWarningText();
        this.file = delivery.getFile();
    }

}
