/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.Alumno;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



/**
 *
 * @author Juancarlos   
 */
public class controladorFormulario {
    @RequestMapping(value="alumno.htm",method=RequestMethod.GET)
    public ModelAndView alumno(){
        return new ModelAndView("alumno","command",new Alumno(0,"Suma",0));
    }/*command*/
    
    @ModelAttribute("especialidades")
    public Map<String,String> especialidades(){
        Map<String,String> especialidad = new LinkedHashMap<>();
        especialidad.put("Adicion","Adicion");
        especialidad.put("Sustraccion","Sustraccion");
        especialidad.put("Multiplicacion","Multiplicacion");
        especialidad.put("Division","Division");
        return especialidad;
    }
    
    @RequestMapping(value="alumno.htm",method=RequestMethod.POST)
    public String alumno(Alumno alu, ModelMap modelo){
       
       modelo.addAttribute("num1",alu.getNum1());
       modelo.addAttribute("especialidad",alu.getEspecialidad());
       modelo.addAttribute("num2",alu.getNum2());
       
       return "recepcion";
    }/*command*/
}
