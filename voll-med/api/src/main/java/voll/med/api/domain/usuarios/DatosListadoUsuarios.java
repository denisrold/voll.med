package voll.med.api.domain.usuarios;

import voll.med.api.domain.medico.Medico;

public record DatosListadoUsuarios(Long id, String login, int role_id) {
    public DatosListadoUsuarios(Usuario usuario){
        this(usuario.getId(), usuario.getLogin(),usuario.getRole_id());
    }
}
