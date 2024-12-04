package br.com.datadomus.configuration;

import br.com.datadomus.modules.residents.entities.Resident;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;

@Service
public class JwtUtils {

    private Key getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode("weiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruweiweiryewuiryueyuweyruwei");
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public String createJwt(Resident resident) {
        Date date = new Date();

        return Jwts.builder()
                .subject(resident.getApartmentNumber().toString())
                .issuedAt(date)
                .expiration(new Date(date.getTime() + 60 * 10 * 1000))
                .signWith(getSigningKey())
                .compact();
    }

    public Resident extractResidentFromJwt(String jwt) {
        Claims claims =  extractClaims(jwt);
        Resident resident = new Resident();
        resident.setApartmentNumber(Integer.valueOf(claims.getSubject()));
        return resident;
    }

    private Claims extractClaims(String jwt) {
        try{
            return Jwts.parser().verifyWith((SecretKey) getSigningKey()).build().parseEncryptedClaims(jwt).getPayload();
        }catch (Exception exception){
            throw new RuntimeException("Problemas na autenticação", exception);
        }
    }

}
