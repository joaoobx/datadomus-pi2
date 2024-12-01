package br.com.datadomus.modules.warnings.usecases.deletewarning;
import br.com.datadomus.modules.warnings.repositories.WarningRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteWarningService {

    final WarningRepository warningRepository;

    public DeleteWarningService(WarningRepository warningRepository) {
        this.warningRepository = warningRepository;
    }

    void execute(Long id){

        try {

            this.warningRepository.deleteById(id);

        } catch (Exception exception) {
            throw new RuntimeException("Reserva de espaço não encontrada");
        }

    }

}
