package br.com.datadomus.modules.deliveries.usecases.getdeliverybyid;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import br.com.datadomus.modules.deliveries.usecases.getdeliverybyid.dtos.GetDeliveryByIdResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetDeliveryByIdController {

    final GetDeliveryByIdService getDeliveryByIdService;

    public GetDeliveryByIdController(GetDeliveryByIdService getDeliveryByIdService) {
        this.getDeliveryByIdService = getDeliveryByIdService;
    }

    @GetMapping("/warning/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GetDeliveryByIdResponseDTO> execute(@PathVariable("id") Long id) {

        Delivery delivery = getDeliveryByIdService.execute(id);

        return ResponseEntity.ok(new GetDeliveryByIdResponseDTO(delivery));
    }
}
