/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.Datos;
import clases.conexion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
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
@RequestMapping("agregar.htm")
public class agregarControlador {
     private JdbcTemplate plantillaJDBC;
    
    public agregarControlador(){
        conexion xcon = new conexion();
        this.plantillaJDBC = new JdbcTemplate(xcon.conexion());
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView agregar(){
        ModelAndView mvc = new ModelAndView();
                mvc.addObject("datos", new Datos());
                mvc.setViewName("agregar");
                return mvc;
    }    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView agregar
        (
                @ModelAttribute("datos") Datos d,
                BindingResult result,
                SessionStatus status
        )
    {
        this.plantillaJDBC.update
        (
        "insert into datos (nombres,apellidos,telefono,sexo) values (?,?,?,?)",
         d.getNombres(),d.getApellidos(),d.getTelefono(),d.getSexo()
        );
         return new ModelAndView("redirect:/listado.htm");
    }

}

