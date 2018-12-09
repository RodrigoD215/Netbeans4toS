/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto2.controlador;

import com.empresa.proyecto2.Servicios.ServicioArchivo;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;



/**
 *
 * @author Rodrigo
 */
@Controller
public class controladorImagen {

    @RequestMapping(value = "archivo", method = RequestMethod.GET)
    public ModelAndView viewRegister() {
        ModelAndView mav = new ModelAndView("archivo");       
        return mav;
    }
    
   @Autowired
    private ServicioArchivo fileService;
    
    @RequestMapping(value = "cargarArchivo", method = RequestMethod.POST)
    public ModelAndView cargarArchivo(@RequestParam("file") MultipartFile multipartFile,
            HttpServletRequest req){
        long tamañoArchivo = multipartFile.getSize();
        String ruta = req.getServletContext().getRealPath("/").
                replace("/build/web/", "/web/") + "/resources/images/";
        String nombreArchivo = multipartFile.getOriginalFilename();
        ModelAndView mvc = new ModelAndView("oks-carga");
        if(fileService.saveFile(multipartFile,ruta)){
            Map<String, Object> modelMap = new HashMap<>();
            modelMap.put("nombreArchivo", nombreArchivo);
            modelMap.put("tamañoArchivo", tamañoArchivo);
            mvc.addAllObjects(modelMap);
            return mvc;
        }
        return new ModelAndView("error-carga");
    }

}

