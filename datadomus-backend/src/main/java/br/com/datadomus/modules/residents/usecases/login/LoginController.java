package br.com.datadomus.modules.residents.usecases.login;

import br.com.datadomus.modules.residents.usecases.login.dtos.LoginRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @DeleteMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public void execute(@Valid @RequestBody LoginRequestDTO request) {

        loginService.execute(request);

    }
}
