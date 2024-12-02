package br.com.datadomus.modules.deliveries.usecases.getdeliverybyid.dtos;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetDeliveryByIdResponseDTO {

    protected Long id;

    @JsonProperty("registration_date")
    protected String registrationDate;

    @JsonProperty("expiration_date")
    protected String expirationDate;

    @JsonProperty("deliveries_orders")
    protected String deliveriesOrders;

    @JsonProperty("Apartment_number")
    protected Integer apartmentNumber;

    public GetDeliveryByIdResponseDTO(Delivery delivery) {
        this.id  = delivery.getId();
        this.registrationDate = delivery.getRegistrationDate();
        this.expirationDate = delivery.getExpirationDate();
        this.deliveriesOrders = delivery.getDeliveriesOrders();
        this.apartmentNumber = delivery.getApartmentNumber();
    }

}
