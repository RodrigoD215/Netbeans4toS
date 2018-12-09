/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import clases.Datos;
import clases.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@RequestMapping("eliminar.htm")
public class eliminarControlador {
    private JdbcTemplate plantillaJDBC;
    
    public eliminarControlador(){
        conexion xcon = new conexion();
        this.plantillaJDBC = new JdbcTemplate(xcon.conexion());
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView eliminar
        (
                @ModelAttribute("datos") Datos d,
                BindingResult result,
                SessionStatus status,
                HttpServletRequest request
        )
    {
        int id=Integer.parseInt(request.getParameter("id"));
        this.plantillaJDBC.update(
                "delete from datos "
                + "where "
                + "codigo=? ",
         id);
         return new ModelAndView("redirect:/listado.htm");
    }
}
