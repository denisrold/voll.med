package voll.med.api.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voll.med.api.medico.DatosListadoMedico;
import voll.med.api.medico.DatosRegistroMedico;
import voll.med.api.medico.Medico;
import voll.med.api.medico.MedicoRepository;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico){
        medicoRepository.save(new Medico(datosRegistroMedico));
    }

    @GetMapping
    public List<DatosListadoMedico> listadoMedico(){
        return medicoRepository.findAll().stream().map(DatosListadoMedico::new).toList();
    }
}
