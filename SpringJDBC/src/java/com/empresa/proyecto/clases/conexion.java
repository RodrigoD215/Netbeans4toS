/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.clases;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Rodrigo
 */
public class conexion {
    public DriverManagerDataSource conexion(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
            datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            datasource.setUrl("jdbc:mysql://localhost:3306/JDBC?"+"useSSL=false&serverTimezone=UTC");
            datasource.setUsername("root");
            datasource.setPassword("tecsup");
            return datasource;
        }
    }
