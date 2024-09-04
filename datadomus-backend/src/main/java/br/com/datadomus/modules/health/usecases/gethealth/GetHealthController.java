package br.com.datadomus.modules.health.usecases.gethealth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHealthController {
    @GetMapping("/")
    public String execute() {
        return "Datadomus funcionando!";
    }
}
