/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.DAO;

import com.empresa.proyecto.DTO.usuariosDTO;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public interface usuariosDAO {
    public List<usuariosDTO> usuariosListar();
    
}
