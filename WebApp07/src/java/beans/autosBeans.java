/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rodrigo
 */
@Named(value = "autosBeans")
@SessionScoped
public class autosBeans implements Serializable {
    // aqui en el lab habia un codigo el cual no era nesesario
    public autosBeans() throws ClassNotFoundException {
            
    }
    private List<Autos> autos;
    private String usuario;
    private String clave;
    private String tipousu;

    public List<Autos> getAutos(){
     return autos;
    }
    public void setAutos(List<Autos> autos){
     this.autos = autos;
    }
    
    public void llenarAutos() throws ClassNotFoundException{
    String[] marcas={"KIA","KIA RIO","KIA RIO CERATO","HYUNDAI","HYUNDAI SANTA FE","HYUNDAI VELOSTER","HYUNDAI TUCSON","TOYOTA",
    "TOYOTA YARIS","TOYOTA CLASIC","SUBARU","HYUNDAI CRETA","HYUNDAI I20","HYUNDAI I30","HYUNDAI I10",
    "CHEVROLET","SPARK LITE","KIA PICANTO","SUSUKI ALTO","MAZDA"};
    
    String[] color={"ROJO","AMARILLO","ROJO","VERDE","AZUL","ROJO","NARANJA","ROSADO",
    "VIOLETA","VERDE","ROSADO","VERDE","ROSADO","AZUL","VERDE",
    "ROSADO","AZUL","AZUL","VERDE","ROJO"};
    
   String[] ano={"2015","2016","1998","2013","2015","2018","1895","1258",
    "1985","2018","2018","2018","2005","2003","2009",
    "2015","2000","2017","2018","2011"};
    
    
    List<Autos> cars=new ArrayList<Autos>();
    for(int i=0;i<20;i++){
    Autos car = new Autos();
    car.setCodigo(i);
    car.setNombre(marcas[i]);
    car.setColor(color[i]);
    car.setVelocidad(i*20);
    car.setFabricacion(ano[i]);
    cars.add(car);
    }
    this.setAutos(cars);
    }
    
    public String loginProject() throws ClassNotFoundException{
    if(usuario.equals("admin")&& clave.equals("123456")){
    this.llenarAutos();
    HttpSession session = Sesion.getSession();
    session.setAttribute("username",usuario);
    return "home";
    }else{
    FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_WARN,"Credenciales invalidas",
            "intente loguearse nuevamente"));
    return "index";
    }
        }

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

    public String getTipousu() {
        return tipousu;
    }

    public void setTipousu(String tipousu) {
        this.tipousu = tipousu;
    }
    
    public String logout(){
    HttpSession session = Sesion.getSession();
    session.invalidate();
    return "index";
    }
    
}
