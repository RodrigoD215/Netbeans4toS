/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.controlador;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;





/**
 *
 * @author Rodrigo
 */
@Controller
public class resultados {
    @RequestMapping("resultados.htm")
    public ModelAndView inicio(){
        ModelAndView modelovista = new ModelAndView();
        modelovista.setViewName("resultados");
        return modelovista;
    }

    @RequestMapping("Multiplicar.htm")
    public ModelAndView Multiplicar(){
        ModelAndView modelovista = new ModelAndView();
        modelovista.setViewName("Multiplicar");
        return modelovista;
    }
    

}
