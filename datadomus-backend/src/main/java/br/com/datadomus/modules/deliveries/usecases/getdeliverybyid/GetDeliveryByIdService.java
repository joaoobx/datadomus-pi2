package br.com.datadomus.modules.deliveries.usecases.getdeliverybyid;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import br.com.datadomus.modules.deliveries.repositories.DeliveryRepository;
import org.springframework.stereotype.Service;

@Service
public class GetDeliveryByIdService {

    final DeliveryRepository deliveryRepository;

    public GetDeliveryByIdService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    Delivery execute(Long id){

        try {

            return this.deliveryRepository.findById(id).orElseThrow();

        } catch (Exception exception) {
            throw new RuntimeException("Reserva de espaço não encontrada");
        }

    }

}
