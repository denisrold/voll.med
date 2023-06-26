package voll.med.api.domain.medico;

import voll.med.api.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String Email, String documento, DatosDireccion direccion) {
}
