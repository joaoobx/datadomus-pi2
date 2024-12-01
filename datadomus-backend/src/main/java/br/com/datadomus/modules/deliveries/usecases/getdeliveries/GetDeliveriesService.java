package br.com.datadomus.modules.deliveries.usecases.getdeliveries;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import br.com.datadomus.modules.deliveries.repositories.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetDeliveriesService {

    final DeliveryRepository deliveryRepository;

    public GetDeliveriesService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    List<Delivery> execute(){

        try {

            return this.deliveryRepository.findAll();

        } catch (Exception exception) {
            throw new RuntimeException("Reservas não encontradas");
        }

    }

}
