package voll.med.api.domain.usuarios;

import jakarta.validation.constraints.*;

public record DatosRegistroUsuario(
        @NotBlank
        String login,
        @NotBlank
        String clave,
        @NotBlank
        String rol
        )
{

}
