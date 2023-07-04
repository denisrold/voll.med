package voll.med.api.domain.usuarios;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import voll.med.api.domain.medico.DatosActualizarMedico;


import java.util.Collection;
import java.util.List;


@Table(name="usuarios")
@Entity(name="Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String clave;
    private Boolean activo;
    private int role_id;

    public Usuario(DatosRegistroUsuario datosRegistroUsuario) {
        this.activo = true;
        this.login = datosRegistroUsuario.login();
        this.clave = datosRegistroUsuario.clave();
        this.role_id = datosRegistroUsuario.role_id();
    }

    public Usuario(DatosRegistroUsuario datosRegistroUsuario, PasswordEncoder passwordEncoder) {
        this.activo = true;
        this.login = datosRegistroUsuario.login();
        this.clave = passwordEncoder.encode(datosRegistroUsuario.clave());
        this.role_id = datosRegistroUsuario.role_id();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));// CONFIGURACION DE USUARIO POR DEFECTO
    }

    @Override
    public String getPassword() {
        return clave;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void actualizarDatos(DatosActualizarUsuario datosActualizarUsuario, PasswordEncoder passwordEncoder) {
        if(datosActualizarUsuario.login() != null ){
            this.login = datosActualizarUsuario.login();
        }
        if(datosActualizarUsuario.clave() != null){
            this.clave = passwordEncoder.encode(datosActualizarUsuario.clave());
        }
    }
    public void actualizarDatosRole(DatosActualizarUsuario datosActualizarUsuario) {
            this.role_id = datosActualizarUsuario.role_id();
    }

    public void desactivarUsuario() {
        this.activo = false;
    }
}
