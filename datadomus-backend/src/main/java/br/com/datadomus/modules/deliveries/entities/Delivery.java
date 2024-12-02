package br.com.datadomus.modules.deliveries.entities;

import br.com.datadomus.modules.deliveries.usecases.createdelivery.dtos.CreateDeliveryRequestDTO;
import br.com.datadomus.modules.deliveries.usecases.updatedelivery.dtos.UpdateDeliveryRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "deliveries")
@NoArgsConstructor
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "registration_date")
    protected String registrationDate = "";

    @Column(name = "expiration_date")
    protected String expirationDate = "";

    @Column(name = "deliveries_orders")
    protected String deliveriesOrders = "";

    @Column(name = "Apartment_number")
    protected String apartmentNumber = "";

    public Delivery(CreateDeliveryRequestDTO createDeliveryRequestDTO) {
        this.registrationDate = createDeliveryRequestDTO.getRegistrationDate();
        this.expirationDate = createDeliveryRequestDTO.getExpirationDate();
        this.deliveriesOrders = createDeliveryRequestDTO.getDeliveriesOrders();
        this.apartmentNumber = createDeliveryRequestDTO.getApartmentNumber();
    }

    public Delivery(UpdateDeliveryRequestDTO updateDeliveryRequestDTO) {
        this.id = updateDeliveryRequestDTO.getId();
        this.registrationDate = updateDeliveryRequestDTO.getRegistrationDate();
        this.expirationDate = updateDeliveryRequestDTO.getExpirationDate();
        this.deliveriesOrders = updateDeliveryRequestDTO.getDeliveriesOrders();
        this.apartmentNumber = updateDeliveryRequestDTO.getApartmentNumber();
    }

}

