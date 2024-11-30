package br.com.datadomus.modules.residents.usecases.getresidents;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetResidentsService {

    final ResidentRepository residentRepository;

    public GetResidentsService(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    List<Resident> execute(){

        try {

            return this.residentRepository.findAll();

        } catch (Exception exception) {
            throw new RuntimeException("Residentes não encontrados");
        }

    }

}
