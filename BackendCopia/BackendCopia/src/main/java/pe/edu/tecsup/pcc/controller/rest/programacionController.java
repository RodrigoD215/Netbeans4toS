package pe.edu.tecsup.pcc.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import pe.edu.tecsup.pcc.jpa.model.pccProgramacion;

import pe.edu.tecsup.pcc.jpa.viewModel.primeTreeViewModel;
import pe.edu.tecsup.pcc.service.pccProgramacionService;

import java.util.List;

/**
 * Created by jpizarro on 21/05/2017.
 */
@RestController

@RequestMapping(value = "/api2/programacion")
public class programacionController  {
    @Autowired
    private pccProgramacionService servicio;

    @RequestMapping("/docencia/cursos")

    //@PreAuthorize("hasRole('PCC_ALUMNO')")
    public List<primeTreeViewModel> cursosActivosDocencia() {
    	
    	
        return servicio.cursosActivosDocenciaGrilla("A");
    }
    
   
    @RequestMapping("/docencia/cursos2")

  
    public List<pccProgramacion> cursosActivosDocencia2() {
    	
    	
        return servicio.listado();
    }
    

//metodos del personal de tecsup, tienen que tener un rol diferente al alumno
    @RequestMapping("/interno/detalle")
    //@PreAuthorize("hasRole('PCC_ALUMNO')")
    public pccProgramacion obtenerDetalleCurso(@RequestBody Integer codigoCurso) {
        return servicio.obtenerDetalleProgramacion(codigoCurso);
    }


}
