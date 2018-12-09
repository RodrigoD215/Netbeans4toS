/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.conexion;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class controladorPrincipal {
    private JdbcTemplate plantillaJDBC;
    public controladorPrincipal(){
        conexion xcon = new conexion();
        this.plantillaJDBC= new JdbcTemplate (xcon.conexion());
    }
    @RequestMapping("listado")
    public ModelAndView listado(){
        ModelAndView mvc = new ModelAndView();
        String sql ="SELECT * FROM datos";
        List datos= this.plantillaJDBC.queryForList(sql);
        mvc.addObject("datos",datos);
        mvc.setViewName("listado");
        return mvc;
    }
    
}
