package br.com.datadomus.modules.warnings.usecases.getwarningbyid;

import br.com.datadomus.modules.warnings.entities.Warning;
import br.com.datadomus.modules.warnings.repositories.WarningRepository;
import org.springframework.stereotype.Service;

@Service
public class GetWarningByIdService {

    final WarningRepository warningRepository;

    public GetWarningByIdService(WarningRepository warningRepository) {
        this.warningRepository = warningRepository;
    }

    Warning execute(Long id){

        try {

            return this.warningRepository.findById(id).orElseThrow();

        } catch (Exception exception) {
            throw new RuntimeException("Reserva de espaço não encontrada");
        }

    }

}
