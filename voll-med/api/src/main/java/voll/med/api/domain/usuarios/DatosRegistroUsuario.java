package voll.med.api.domain.usuarios;

import jakarta.validation.constraints.*;

public record DatosRegistroUsuario(
        @NotBlank
        String login,
        @NotBlank
        String clave,
        @DecimalMin(value = "1", message = "El role_id debe ser mayor o igual a 1")
        @DecimalMax(value = "3", message = "El role_id debe ser menor o igual a 3")
        int role_id
        )
{
}
