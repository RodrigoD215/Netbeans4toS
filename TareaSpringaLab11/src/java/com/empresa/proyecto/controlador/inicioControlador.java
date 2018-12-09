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
public class inicioControlador {
    
    @RequestMapping("acercade.htm")
    public ModelAndView acercade(){
        ModelAndView modelovista = new ModelAndView();
        modelovista.setViewName("acercade");
        return modelovista;
    }
    @RequestMapping("resultados.htm")
    public ModelAndView resultados(HttpServletRequest variable){
        ModelAndView modelovista = new ModelAndView();
        modelovista.setViewName("resultados");
        String num1 = variable.getParameter("num1");
        String num2 = variable.getParameter("num2");
        String ope = variable.getParameter("ope");
        modelovista.addObject("num1",num1);
        modelovista.addObject("num2",num2);
        modelovista.addObject("ope",ope);
        return modelovista;
    }
    
}
