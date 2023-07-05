package voll.med.api.domain.usuarios;

import voll.med.api.domain.medico.Medico;

public record DatosListadoUsuarios(Long id, String login, String rol) {
    public DatosListadoUsuarios(Usuario usuario){
        this(usuario.getId(), usuario.getLogin(),usuario.getRol());
    }
}
