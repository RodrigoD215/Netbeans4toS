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
@RequestMapping("editar.htm")
public class editarControlador {
    private JdbcTemplate plantillaJDBC;
    
    public editarControlador(){
        conexion xcon = new conexion();
        this.plantillaJDBC = new JdbcTemplate(xcon.conexion());
    }
    
    public Datos selectUsuario(int id) 
    {
        final Datos datos = new Datos();
        String consulta = "SELECT * FROM datos WHERE codigo=" + id+"";
        return (Datos) plantillaJDBC.query
        (
                consulta, new ResultSetExtractor<Datos>() 
            {
                public Datos extractData(ResultSet rs) throws SQLException, DataAccessException {
                    if (rs.next()) {
                        datos.setNombres(rs.getString("nombres"));
                        datos.setApellidos(rs.getString("apellidos"));
                        datos.setTelefono(rs.getString("telefono"));
                        datos.setSexo(rs.getString("sexo"));
                    }
                    return datos;
                }


            }
        );
    }
    
    @RequestMapping(method=RequestMethod.GET) 
    public ModelAndView editar(HttpServletRequest request)
    {
        ModelAndView mav=new ModelAndView();
        int id=Integer.parseInt(request.getParameter("id"));
        Datos datos=this.selectUsuario(id);
        mav.addObject("datos",new Datos(id,datos.getNombres(),datos.getApellidos(),datos.getTelefono(),datos.getSexo()));
        mav.setViewName("editar");
        return mav;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView editar
        (
                @ModelAttribute("datos") Datos d,
                BindingResult result,
                SessionStatus status,
                HttpServletRequest request
        )
    {
        int id=Integer.parseInt(request.getParameter("id"));
        this.plantillaJDBC.update(
                    "update datos "
                + "set nombres=?,"
                + " apellidos=?,"
                + "telefono=?,"
                + "sexo=? "
                + "where "
                + "codigo=? ",
         d.getNombres(),d.getApellidos(),d.getTelefono(),d.getSexo(),id);
         return new ModelAndView("redirect:/listado.htm");
    }
}

