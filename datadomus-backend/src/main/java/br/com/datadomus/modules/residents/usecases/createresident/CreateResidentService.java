package br.com.datadomus.modules.residents.usecases.createresident;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import br.com.datadomus.modules.residents.usecases.createresident.dtos.CreateResidentRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class CreateResidentService {

    final ResidentRepository residentRepository;

    public CreateResidentService(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    Resident execute(CreateResidentRequestDTO request){

        return this.residentRepository.save(new Resident(request));

    }

}
