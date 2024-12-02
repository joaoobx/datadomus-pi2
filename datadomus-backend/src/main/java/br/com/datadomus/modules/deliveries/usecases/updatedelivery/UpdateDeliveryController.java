package br.com.datadomus.modules.deliveries.usecases.updatedelivery;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import br.com.datadomus.modules.deliveries.usecases.updatedelivery.dtos.UpdateDeliveryRequestDTO;
import br.com.datadomus.modules.deliveries.usecases.updatedelivery.dtos.UpdateDeliveryResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateDeliveryController {

    final UpdateDeliveryService updateDeliveryService;

    public UpdateDeliveryController(UpdateDeliveryService updateDeliveryService) {
        this.updateDeliveryService = updateDeliveryService;
    }

    @PutMapping("/delivery/update")
    public ResponseEntity<UpdateDeliveryResponseDTO> execute(@Valid @RequestBody UpdateDeliveryRequestDTO request) {

        Delivery delivery = updateDeliveryService.execute(request);

        return ResponseEntity.ok(new UpdateDeliveryResponseDTO(delivery));
    }
}
