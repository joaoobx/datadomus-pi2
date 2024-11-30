package br.com.datadomus.modules.residents.usecases.deleteresident;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeleteResidentController {

    final DeleteResidentService deleteResidentService;

    public DeleteResidentController(DeleteResidentService deleteResidentService) {
        this.deleteResidentService = deleteResidentService;
    }

    @DeleteMapping("/resident/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void execute(@PathVariable("id") Long id) {

        deleteResidentService.execute(id);

    }
}
