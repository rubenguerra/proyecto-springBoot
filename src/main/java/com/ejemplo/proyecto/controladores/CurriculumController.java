package com.ejemplo.proyecto.controladores;

import com.ejemplo.proyecto.modelo.Curriculum;
import com.ejemplo.proyecto.servicios.ICurriculumServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiDatos/")
public class CurriculumController {

    @Autowired
    private ICurriculumServicio curriculumServicio;

    @PostMapping("/curriculum")
    public void agregarCurriculum(@RequestBody Curriculum curriculum){
        curriculumServicio.crearCurriculum(curriculum);
    }

    @GetMapping("/datos")
    @ResponseBody
    public List<Curriculum> verCurriculum(){
        return curriculumServicio.verCurriculum();
    }

    @DeleteMapping("/borrar-datos/{id}")
    public void borrarCurriculum(@PathVariable Long id){
        curriculumServicio.borrarCurriculum(id);
    }
}
