package br.com.datadomus.modules.residents.usecases.login;

import br.com.datadomus.configuration.BCryptUtil;
import br.com.datadomus.configuration.JwtUtils;
import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import br.com.datadomus.modules.residents.usecases.login.dtos.LoginRequestDTO;
import br.com.datadomus.modules.residents.usecases.login.dtos.LoginResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    final
    JwtUtils jwtUtils;

    final
    BCryptUtil bCryptUtil;

    final ResidentRepository residentRepository;

    public LoginService(ResidentRepository residentRepository, JwtUtils jwtUtils, BCryptUtil bCryptUtil) {
        this.residentRepository = residentRepository;
        this.jwtUtils = jwtUtils;
        this.bCryptUtil = bCryptUtil;
    }

    LoginResponseDTO execute(LoginRequestDTO request){
            Resident resident = this.residentRepository.findResidentByApartmentNumber(request.getApartmentNumber());

            String password = request.getPassword();

            if(Boolean.FALSE.equals(bCryptUtil.matches(password, resident.getPassword()))) {
                throw new RuntimeException("Senha incorreta");
            }

            return new LoginResponseDTO(jwtUtils.createJwt(resident));

    }

}
