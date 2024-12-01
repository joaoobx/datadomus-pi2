package br.com.datadomus.modules.deliveries.usecases.deletedelivery;
import br.com.datadomus.modules.deliveries.repositories.DeliveryRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteDeliveryService {

    final DeliveryRepository deliveryRepository;

    public DeleteDeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    void execute(Long id){

        try {

            this.deliveryRepository.deleteById(id);

        } catch (Exception exception) {
            throw new RuntimeException("Reserva de espaço não encontrada");
        }

    }

}
