package br.com.datadomus.modules.residents.usecases.createresident;

import br.com.datadomus.configuration.BCryptUtil;
import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import br.com.datadomus.modules.residents.usecases.createresident.dtos.CreateResidentRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class CreateResidentService {

    final ResidentRepository residentRepository;

    final BCryptUtil bCryptUtil;

    public CreateResidentService(ResidentRepository residentRepository, BCryptUtil bCryptUtil) {
        this.residentRepository = residentRepository;
        this.bCryptUtil = bCryptUtil;
    }

    Resident execute(CreateResidentRequestDTO request){

        String password = request.getPassword();

        String encryptedPassword = bCryptUtil.encode(password);

        request.setPassword(encryptedPassword);

        return this.residentRepository.save(new Resident(request));

    }

}
