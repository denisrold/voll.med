package voll.med.api.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;
import voll.med.api.domain.usuarios.Usuario;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service

public class TokenService {
    public String generarToken(Usuario usuario){
        try {
            Algorithm algorithm = Algorithm.HMAC256("123456");
           return JWT.create()
                    .withIssuer("voll.med")
                   .withSubject(usuario.getLogin())
                   .withClaim("id",usuario.getId())
                   .withExpiresAt(generarFechaExpriacion())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            throw new RuntimeException();
        }
    }

    private Instant generarFechaExpriacion(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-05:00"));
    }
}
