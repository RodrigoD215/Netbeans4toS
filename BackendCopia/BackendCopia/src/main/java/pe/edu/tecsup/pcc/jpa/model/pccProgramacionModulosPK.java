package pe.edu.tecsup.pcc.jpa.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by jpizarro on 11/05/2017.
 */

@Embeddable
public class pccProgramacionModulosPK implements Serializable {
    @Column(name="ID_PROGRAMACION_PADRE",nullable = false)
    private Integer idProgramacionPadre;

    @Column(name="ID_PROGRAMACION_HIJO",nullable = false)
    private Integer idProgramacionHijo;

    public Integer getIdProgramacionPadre() {
        return idProgramacionPadre;
    }

    public void setIdProgramacionPadre(Integer idProgramacionPadre) {
        this.idProgramacionPadre = idProgramacionPadre;
    }

    public Integer getIdProgramacionHijo() {
        return idProgramacionHijo;
    }

    public void setIdProgramacionHijo(Integer idProgramacionHijo) {
        this.idProgramacionHijo = idProgramacionHijo;
    }

    public Byte getOrden() {
        return orden;
    }

    public void setOrden(Byte orden) {
        this.orden = orden;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Column(name="ORDEN",nullable = false)
    private Byte orden;

    @Column(name="TIPO",nullable = false,length = 5)
    private String tipo;

}
