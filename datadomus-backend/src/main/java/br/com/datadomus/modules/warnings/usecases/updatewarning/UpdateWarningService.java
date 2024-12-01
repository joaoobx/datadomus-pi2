package br.com.datadomus.modules.warnings.usecases.updatewarning;

import br.com.datadomus.modules.warnings.entities.Warning;
import br.com.datadomus.modules.warnings.repositories.WarningRepository;
import br.com.datadomus.modules.warnings.usecases.updatewarning.dtos.UpdateWarningRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class UpdateWarningService {

    final WarningRepository warningRepository;

    public UpdateWarningService(WarningRepository warningRepository) {
        this.warningRepository = warningRepository;
    }

    Warning execute(UpdateWarningRequestDTO request){

        return this.warningRepository.save(new Warning(request));

    }

}
