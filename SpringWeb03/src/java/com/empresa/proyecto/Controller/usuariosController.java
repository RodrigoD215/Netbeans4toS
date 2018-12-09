/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.Controller;

import com.empresa.proyecto.DAO.usuariosDAO;
import com.empresa.proyecto.DAO.usuariosDAOImple;
import com.empresa.proyecto.DTO.usuariosDTO;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class usuariosController {
    private usuariosDAO usuariosDAO;
    public void setUsuariosDAOImple(usuariosDAOImple usuariosDAOImple) {
        this.usuariosDAO = usuariosDAOImple;
    }
    
    //metodo para listar usuarios
    private ModelAndView grilla() {
        List<usuariosDTO> list = usuariosDAO.usuariosListar();
        ModelAndView mav = new ModelAndView("usuarios");
        mav.addObject("usuarios_list", list);
        return mav;
    }
    
    @RequestMapping(value = "usuarios",params = "accion=list")
    public ModelAndView usuariosListar() {
        ModelAndView mav = grilla();
        return mav;
    }    
}

