package br.com.datadomus.modules.warnings.usecases.getwarnings;

import br.com.datadomus.modules.warnings.entities.Warning;
import br.com.datadomus.modules.warnings.repositories.WarningRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetWarningsService {

    final WarningRepository warningRepository;

    public GetWarningsService(WarningRepository warningRepository) {
        this.warningRepository = warningRepository;
    }

    List<Warning> execute(){

        try {

            return this.warningRepository.findAll();

        } catch (Exception exception) {
            throw new RuntimeException("Reservas não encontradas");
        }

    }

}
