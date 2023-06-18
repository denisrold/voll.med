package voll.med.api.medico;

import voll.med.api.direccion.DatosDireccion;

public record DatosRegistroMedico(String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion) {
}
