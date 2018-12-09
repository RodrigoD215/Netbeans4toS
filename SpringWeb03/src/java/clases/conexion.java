/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Juancarlos
 */
public class conexion {
    public DriverManagerDataSource conexion(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
            datasource.setDriverClassName("com.mysql.jdbc.Driver");
            datasource.setUrl("jdbc:mysql://localhost/prueba");
            datasource.setUsername("root");
            datasource.setPassword("");
            return datasource;
        }
    }
    

