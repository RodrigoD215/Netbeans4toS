/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.controlador;


import com.empresa.proyecto.clases.Datos;
import com.empresa.proyecto.clases.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("index.htm")
public class buscadorControlador {
     private JdbcTemplate plantillaJDBC;
    
    public buscadorControlador(){
        conexion xcon = new conexion();
        this.plantillaJDBC = new JdbcTemplate(xcon.conexion());
    }
        
    @RequestMapping(method=RequestMethod.GET) 
    public ModelAndView editar(HttpServletRequest request)
    {
        ModelAndView mav=new ModelAndView();
        mav.addObject("datos", new Datos());
        mav.setViewName("index");
        return mav;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView buscar
        (
                @ModelAttribute("datos") Datos d,
                BindingResult result,
                SessionStatus status,
                HttpServletRequest request
        )
    {
         String a= d.getNombres();
        
        ModelAndView mvc = new ModelAndView();
        String sql ="SELECT * FROM datos where nombres like '%"+a+"%'";
        List datos= this.plantillaJDBC.queryForList(sql);
        String msm="nel";
        if(!datos.isEmpty()){
            mvc.addObject("datos",datos);
            mvc.setViewName("resultado");
            return mvc;
        }else{
         mvc.addObject("msm",msm);
         mvc.setViewName("resultado");
        return mvc;}
    }
}
