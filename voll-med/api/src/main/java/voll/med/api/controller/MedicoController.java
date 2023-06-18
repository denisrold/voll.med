package voll.med.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import voll.med.api.medico.DatosRegistroMedico;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping
    public void registrarMedico(@RequestBody DatosRegistroMedico datosRegistroMedico){
        System.out.println(datosRegistroMedico);
    }
}
