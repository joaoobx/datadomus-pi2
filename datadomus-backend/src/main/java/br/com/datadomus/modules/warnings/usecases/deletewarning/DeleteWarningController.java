package br.com.datadomus.modules.warnings.usecases.deletewarning;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteWarningController {

    final DeleteWarningService deleteWarningService;

    public DeleteWarningController(DeleteWarningService deleteWarningService) {
        this.deleteWarningService = deleteWarningService;
    }

    @DeleteMapping("/warning/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void execute(@PathVariable("id") Long id) {

        deleteWarningService.execute(id);

    }
}
