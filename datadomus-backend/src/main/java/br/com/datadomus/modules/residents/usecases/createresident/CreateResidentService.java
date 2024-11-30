package br.com.datadomus.modules.residents.usecases.createresident;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import br.com.datadomus.modules.residents.usecases.createresident.dtos.CreateResidentRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateResidentService {

    @Autowired
    ResidentRepository residentRepository;

    Resident execute(CreateResidentRequestDTO request){

        return this.residentRepository.save(new Resident(request));

    }

}
