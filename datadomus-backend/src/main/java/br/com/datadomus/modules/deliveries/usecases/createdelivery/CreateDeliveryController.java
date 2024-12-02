package br.com.datadomus.modules.deliveries.usecases.createdelivery;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import br.com.datadomus.modules.deliveries.usecases.createdelivery.dtos.CreateDeliveryRequestDTO;
import br.com.datadomus.modules.deliveries.usecases.createdelivery.dtos.CreateDeliveryResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateDeliveryController {

    final CreateDeliveryService createDeliveryService;

    public CreateDeliveryController(CreateDeliveryService createDeliveryService) {
        this.createDeliveryService = createDeliveryService;
    }

    @PostMapping("/delivery/create")
    public ResponseEntity<CreateDeliveryResponseDTO> execute(@Valid @RequestBody CreateDeliveryRequestDTO request) {

        Delivery delivery = createDeliveryService.execute(request);

        return ResponseEntity.ok(new CreateDeliveryResponseDTO(delivery));
    }
}
