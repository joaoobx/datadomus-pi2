package br.com.datadomus.modules.deliveries.usecases.updatedelivery;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import br.com.datadomus.modules.deliveries.repositories.DeliveryRepository;
import br.com.datadomus.modules.deliveries.usecases.updatedelivery.dtos.UpdateDeliveryRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class UpdateDeliveryService {

    final DeliveryRepository deliveryRepository;

    public UpdateDeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    Delivery execute(UpdateDeliveryRequestDTO request){

        return this.deliveryRepository.save(new Delivery(request));

    }

}
