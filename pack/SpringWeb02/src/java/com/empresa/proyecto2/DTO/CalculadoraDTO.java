/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto2.DTO;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Bladimir
 */
public class CalculadoraDTO {
    @NotEmpty(message = "Este campo es obligatorio")
    @Pattern(regexp = ".*([0-9]\\.?\\d*)", message = "Solo se permiten datos numericos")
    @Size(min = 1, max = 6, message = "Minimo 6 numeros")
    
    private String valor1;
    @NotEmpty(message = "Este campo es obligatorio")
    @Pattern(regexp = ".*([0-9]\\.?\\d*)", message = "Solo se permiten datos numericos")
    @Size(min = 1, max = 6, message = "Minimo 6 numeros")
    
    private String valor2;
    private String operacion;
    private String[] operaciones = {"suma","resta","multiplicacion","divicion"};

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String[] operaciones) {
        this.operaciones = operaciones;
    }
    
    
    
}
