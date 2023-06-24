package voll.med.api.medico;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import voll.med.api.direccion.DatosDireccion;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, @Valid DatosDireccion direccion) {
}
