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
    private String clave="holaMundo" ;
    private String descripcion="Una gran persona :p" ;
    private String[] cursos;
    private String[] materias = {"Desarrolo de Aplicaciones Web",
                                    "Desarrollo de Aplicaciones Moviles",
                                    "Aplicaciones Empresariales",
                                    "Pruebas de Testeo"};
   private String[] materias1 = {"Desarrolo de Aplicaciones Web",
                                    "Desarrollo de Aplicaciones Moviles",
                                    "Aplicaciones Empresariales",
                                    "Pruebas de Testeo"};
    private String semestre;
    private String beneficios;
    private String[] cursos1;
    private String acciones;
    
    
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String[] getCursos1() {
        return cursos1;
    }

    public void setCursos1(String[] cursos1) {
        this.cursos1 = cursos1;
    }

    public String getAcciones() {
        return acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }

    public String[] getMaterias1() {
        return materias1;
    }

    public void setMaterias1(String[] materias1) {
        this.materias1 = materias1;
    }
    
    
    public datos(){
    }
}
