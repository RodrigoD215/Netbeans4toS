/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Juancarlos
 */
public class Alumno {
    private int num1;
    private String especialidad;
    private int num2;

    public Alumno(){
        
    }

    public Alumno(int num1, String especialidad, int num2) {
        this.num1 = num1;
        this.especialidad = especialidad;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

   
}
