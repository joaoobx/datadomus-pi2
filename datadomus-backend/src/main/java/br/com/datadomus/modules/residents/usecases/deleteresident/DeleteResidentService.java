package br.com.datadomus.modules.residents.usecases.deleteresident;

import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteResidentService {

    final ResidentRepository residentRepository;

    public DeleteResidentService(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    void execute(Long id){

        try {

            this.residentRepository.deleteById(id);

        } catch (Exception exception) {
            throw new RuntimeException("Residente não encontrado");
        }

    }

}
