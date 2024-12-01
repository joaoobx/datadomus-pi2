package br.com.datadomus.modules.deliveries.usecases.deletedelivery;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteDeliveryController {

    final DeleteDeliveryService deleteDeliveryService;

    public DeleteDeliveryController(DeleteDeliveryService deleteDeliveryService) {
        this.deleteDeliveryService = deleteDeliveryService;
    }

    @DeleteMapping("/warning/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void execute(@PathVariable("id") Long id) {

        deleteDeliveryService.execute(id);

    }
}
