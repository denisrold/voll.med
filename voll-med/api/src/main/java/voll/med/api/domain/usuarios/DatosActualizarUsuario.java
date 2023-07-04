package voll.med.api.domain.usuarios;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarUsuario(@NotNull Long id, String login, String clave, int role_id) {
}
