package voll.med.api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import voll.med.api.domain.usuarios.DatosRegistroUsuario;
import voll.med.api.domain.usuarios.DatosRespuestaUsuario;
import voll.med.api.domain.usuarios.Usuario;
import voll.med.api.domain.usuarios.UsuarioRepository;

import java.net.URI;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    public PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity<DatosRespuestaUsuario> registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario, UriComponentsBuilder uriComponentsBuilder){
        Usuario usuario = usuarioRepository.save(new Usuario(datosRegistroUsuario,passwordEncoder));
        DatosRespuestaUsuario datosRespuestaUsuario = new DatosRespuestaUsuario(usuario.getLogin());
        URI url = uriComponentsBuilder.path("/usuario/{id}").buildAndExpand(usuario.getId()).toUri();
    return ResponseEntity.created(url).body(datosRespuestaUsuario);
    }

    /*
     -HASHEAR EL PASSWORD ->Hasheando el password

     -GET USUARIOS
     -MODIFICAR USUARIO
     -DELETE USER ->  agregarle propiedad active a usuarios
    */

}