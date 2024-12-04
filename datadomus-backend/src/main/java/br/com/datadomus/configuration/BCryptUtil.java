package br.com.datadomus.configuration;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptUtil {

    private static final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();


    public String encode(String plainText) {
        return bCryptPasswordEncoder.encode(plainText);
    }

    public Boolean matches(String rawPassword,String encodedPassword) {
        return bCryptPasswordEncoder.matches(rawPassword, encodedPassword);
    }

}
