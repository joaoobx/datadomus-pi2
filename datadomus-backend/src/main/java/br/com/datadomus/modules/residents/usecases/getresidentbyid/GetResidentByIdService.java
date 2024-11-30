package br.com.datadomus.modules.residents.usecases.getresidentbyid;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import org.springframework.stereotype.Service;

@Service
public class GetResidentByIdService {

    final ResidentRepository residentRepository;

    public GetResidentByIdService(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    Resident execute(Long id){

        try {

            return this.residentRepository.findById(id).orElseThrow();

        } catch (Exception exception) {
            throw new RuntimeException("Residente não encontrado");
        }

    }

}
