
package net.codigoalonso.model;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author jaime
 */
public class User {
    //@Min(1)
    //@Max(10)
    //@Range(min=1,max=12)
    //@Size(min=1, max=12)
    
    private int id;    
    @NotNull
    @NotEmpty(message = "Coloque un nombre")
    private String nameP;
    private String country;
    private int DNI;
    @NotEmpty(message = "Coloque su apellido Materno")
    private String apellidoMaterno;
    @NotEmpty(message = "Coloque su apellido Paterno.")
    private String apellidoPaterno;
    private String info;
    @NotEmpty(message = "Este campo es obligatorio")
    private String TDoc;
    private String sexo;
    private String ELaboral;
    private String Ecivil;
    private String fechaN;
    private String fechaU;
    private String fechaA;
    private String tado;

    
    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }
    public String getTado() {
        return tado;
    }

    public void setTado(String tado) {
        this.tado = tado;
    }

    public String getFechaA() {
        return fechaA;
    }

    public void setFechaA(String fechaA) {
        this.fechaA = fechaA;
    }
    

    public String getFechaU() {
        return fechaU;
    }

    public void setFechaU(String fechaU) {
        this.fechaU = fechaU;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }
    
    public String getEcivil() {
        return Ecivil;
    }

    public void setEcivil(String Ecivil) {
        this.Ecivil = Ecivil;
    }

    public String getELaboral() {
        return ELaboral;
    }

    public void setELaboral(String ELaboral) {
        this.ELaboral = ELaboral;
    }
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTDoc() {
        return TDoc;
    }

    public void setTDoc(String TDoc) {
        this.TDoc = TDoc;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public User() {
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + nameP + ", password=" +'}';
    }
    
    
    
    
    
    
}
