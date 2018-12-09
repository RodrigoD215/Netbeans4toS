/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "datos")
@SessionScoped
public class datos implements Serializable {
    private String usuario = "Rodrigo Duenas";
    private String[] departamentos;
    private String departamentos1;   
    private String[] cursos;   
    private String[] cursos1 = {"Matematica", "Fisica", "Quimica", "Programacion Orientada a Objetos", "Desarrollo en Android", "Desarrollo en IOS", "Informatica Aplicada", "etc"};    
    private String correo;
    private String telefono;
    private String[] info;   
    private String[] info1 = {"Tecnologia", "Deportes", "Diplomados", "Becas", "etc"};    
    private String politicas;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String[] departamentos) {
        this.departamentos = departamentos;
    }

    public String getDepartamentos1() {
        return departamentos1;
    }

    public void setDepartamentos1(String departamentos1) {
        this.departamentos1 = departamentos1;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public String[] getCursos1() {
        return cursos1;
    }

    public void setCursos1(String[] cursos1) {
        this.cursos1 = cursos1;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String[] getInfo() {
        return info;
    }

    public void setInfo(String[] info) {
        this.info = info;
    }

    public String[] getInfo1() {
        return info1;
    }

    public void setInfo1(String[] info1) {
        this.info1 = info1;
    }

    public String getPoliticas() {
        return politicas;
    }

    public void setPoliticas(String politicas) {
        this.politicas = politicas;
    }  
    public datos(){
    }
}
