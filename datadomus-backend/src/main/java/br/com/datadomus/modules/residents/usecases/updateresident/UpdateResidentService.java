package br.com.datadomus.modules.residents.usecases.updateresident;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import br.com.datadomus.modules.residents.usecases.updateresident.dtos.UpdateResidentRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class UpdateResidentService {

    final ResidentRepository residentRepository;

    public UpdateResidentService(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    Resident execute(UpdateResidentRequestDTO request){

        return this.residentRepository.save(new Resident(request));

    }

}
