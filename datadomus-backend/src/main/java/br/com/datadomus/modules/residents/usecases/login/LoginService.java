package br.com.datadomus.modules.residents.usecases.login;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import br.com.datadomus.modules.residents.usecases.login.dtos.LoginRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    final ResidentRepository residentRepository;

    public LoginService(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    void execute(LoginRequestDTO request){

        try {

            Resident resident = this.residentRepository.findResidentByApartmentNumber(request.getApartmentNumber());



        } catch (Exception exception) {
            throw new RuntimeException("Residente não encontrado");
        }

    }

}
