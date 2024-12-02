package br.com.datadomus.modules.deliveries.usecases.getdeliveries;

import br.com.datadomus.modules.deliveries.entities.Delivery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetDeliveriesController {

    final GetDeliveriesService getDeliveriesService;

    public GetDeliveriesController(GetDeliveriesService getDeliveriesService) {
        this.getDeliveriesService = getDeliveriesService;
    }

    @GetMapping("/deliveries")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Delivery>> execute() {

        List<Delivery> deliveries = getDeliveriesService.execute();

        return ResponseEntity.ok(deliveries);
    }
}
