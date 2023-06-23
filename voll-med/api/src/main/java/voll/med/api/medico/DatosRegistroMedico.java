package voll.med.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import voll.med.api.direccion.DatosDireccion;

public record DatosRegistroMedico(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefono,
        @Pattern(regexp = "\\d{4,6}") // me aseguro que sean numeros.
        String documento,
        @NotNull // porque es un ENUM
        Especialidad especialidad,
        @NotNull // porque es un objeto
        @Valid
        DatosDireccion direccion) {
}
