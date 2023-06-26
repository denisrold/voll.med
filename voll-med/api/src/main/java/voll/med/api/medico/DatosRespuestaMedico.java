package voll.med.api.medico;

import voll.med.api.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String Email, DatosDireccion direccion) {
}
