package br.com.datadomus.modules.deliveries.usecases.createdelivery;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import br.com.datadomus.modules.deliveries.repositories.DeliveryRepository;
import br.com.datadomus.modules.deliveries.usecases.createdelivery.dtos.CreateDeliveryRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class CreateDeliveryService {

    final DeliveryRepository deliveryRepository;

    public CreateDeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    Delivery execute(CreateDeliveryRequestDTO request){

        return this.deliveryRepository.save(new Delivery(request));

    }

}
