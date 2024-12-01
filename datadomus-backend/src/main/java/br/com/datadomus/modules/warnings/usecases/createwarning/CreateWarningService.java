package br.com.datadomus.modules.warnings.usecases.createwarning;

import br.com.datadomus.modules.warnings.entities.Warning;
import br.com.datadomus.modules.warnings.repositories.WarningRepository;
import br.com.datadomus.modules.warnings.usecases.createwarning.dtos.CreateWarningRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class CreateWarningService {

    final WarningRepository warningRepository;

    public CreateWarningService(WarningRepository warningRepository) {
        this.warningRepository = warningRepository;
    }

    Warning execute(CreateWarningRequestDTO request){

        return this.warningRepository.save(new Warning(request));

    }

}
