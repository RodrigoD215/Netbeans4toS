/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.Alumno;
import clases.validaAlumno;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Juancarlos
 */
@Controller
@RequestMapping("alumno2.htm")
public class controladorFormulario2 {
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView alumno(){
        ModelAndView mvc= new ModelAndView();
        mvc.setViewName("alumno2");
        mvc.addObject("alumno",new Alumno());
        return mvc;
    }
    
    private validaAlumno validarAlumno;
    public controladorFormulario2(){
        this.validarAlumno = new validaAlumno() {};
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView alumno(@ModelAttribute("alumno") Alumno alu, BindingResult resultado,SessionStatus estado){
        this.validarAlumno.validate(alu,resultado);
        if(resultado.hasErrors()){
            ModelAndView mvc = new ModelAndView();
            mvc.setViewName("alumno2");
            mvc.addObject("alumno",new Alumno());
            return mvc;
        }else{
            ModelAndView mvc = new ModelAndView();
            mvc.setViewName("recepcion");
            double resul =0;
            if (alu.getEspecialidad().equals("Adicion")) {
                double a=alu.getNum1();
                double b=alu.getNum2();
                resul =a+b;
            }else if(alu.getEspecialidad().equals("Sustraccion")){
                double a=alu.getNum1();
                double b=alu.getNum2();
                 resul =a-b;
            }else if(alu.getEspecialidad().equals("Multiplicacion")){
                double a=alu.getNum1();
                double b=alu.getNum2();
                 resul =a*b;
            }else{
                double a=alu.getNum1();
                double b=alu.getNum2();
                 resul =a/b;
            }
              
            mvc.addObject("numero1",alu.getNum1());
            mvc.addObject("operacion",alu.getEspecialidad());
            mvc.addObject("numero2",alu.getNum2());
            mvc.addObject("resul",resul);
            return mvc;
        }
        
    }
    @ModelAttribute("especialidades")
    public Map<String,String> especialidades(){
        Map<String,String> especialidad = new LinkedHashMap<>();
        especialidad.put("Adicion","Adicion");
        especialidad.put("Sustraccion","Sustraccion");
        especialidad.put("Multiplicacion","Multiplicacion");
        especialidad.put("Division","Division");
        return especialidad;
    }
    
}
