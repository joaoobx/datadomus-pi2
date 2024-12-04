package br.com.datadomus.modules.residents.usecases.updateresident;

import br.com.datadomus.modules.residents.entities.Resident;
import br.com.datadomus.modules.residents.repositories.ResidentRepository;
import br.com.datadomus.modules.residents.usecases.updateresident.dtos.UpdateResidentRequestDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UpdateResidentService {

    final ResidentRepository residentRepository;

    public UpdateResidentService(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    Resident execute(UpdateResidentRequestDTO request){

        String password = request.getPassword();

        String encryptedPassword = new BCryptPasswordEncoder().encode(password);

        request.setPassword(encryptedPassword);

        return this.residentRepository.save(new Resident(request));

    }

}
