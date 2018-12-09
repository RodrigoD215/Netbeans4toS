/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.DAO;

import com.empresa.proyecto.DTO.usuariosDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Rodrigo
 */
public class usuariosDAOImple implements usuariosDAO{
    
    private JdbcTemplate jdbcTemplate;
    public void setConexion(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<usuariosDTO> usuariosListar() {
       String sql = "SELECT "
                + "codigo,"
                + "nombre,"
                + "clave,"
                + "estado "
                + "FROM t_usuarios "
                + "ORDER BY codigo";
       RowMapper mapper = new RowMapper() {
           @Override
           public Object mapRow(ResultSet rs, int i) throws SQLException {
                usuariosDTO p = new usuariosDTO();
                p.setCodigo(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setClave(rs.getString(3));
                p.setEstado(rs.getString(4));

                return p;
 
           }
       };
       List<usuariosDTO> list = jdbcTemplate.query(sql, mapper);
        return list;

    }

          
}

