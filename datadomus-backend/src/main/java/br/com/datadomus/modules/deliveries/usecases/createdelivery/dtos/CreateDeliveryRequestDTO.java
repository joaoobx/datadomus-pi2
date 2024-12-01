package br.com.datadomus.modules.deliveries.usecases.createdelivery.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateDeliveryRequestDTO {

    @NotBlank(message = "O campo 'registration_date' deve ser preenchido")
    @NotNull(message = "O campo 'registration_date' não está presente ")
    @JsonProperty("registration_date")
    protected String registrationDate = "";

    @NotBlank(message = "O campo 'expiration_date' deve ser preenchido")
    @NotNull(message = "O campo 'expiration_date' não está presente ")
    @JsonProperty("expiration_date")
    protected String expirationDate = "";

    @NotBlank(message = "O campo 'deliveries_orders' deve ser preenchido")
    @NotNull(message = "O campo 'deliveries_orders' não está presente ")
    @JsonProperty("deliveries_orders")
    protected String deliveriesOrders = "";

    @NotBlank(message = "O campo 'apartment_number' deve ser preenchido")
    @NotNull(message = "O campo 'apartment_number' não está presente ")
    @JsonProperty("apartment_number")
    protected String apartmentNumber = "";

}
