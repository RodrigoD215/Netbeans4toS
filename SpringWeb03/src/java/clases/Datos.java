package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juancarlos
 */
public class Datos {
    private int codigo;
    private String nombres,apellidos,telefono,sexo;
   
    public Datos(){
        
    } 
    public Datos(int codigo, String nombres, String apellidos, String telefono, String sexo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
