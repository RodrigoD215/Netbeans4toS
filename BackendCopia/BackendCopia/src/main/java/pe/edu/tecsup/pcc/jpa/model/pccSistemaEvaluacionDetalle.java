package pe.edu.tecsup.pcc.jpa.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jpizarro on 2/05/2017.
 */
@Entity
@Table(name="PCC_SISTEMA_EVALUACION_DETAL")
public class pccSistemaEvaluacionDetalle  implements Serializable {
    @Id
    @Column(name="CODSISTEVAL")
   private Integer id_Se;


    public pccSistemaEvaluacionTipo getCodigoEvaluacion() {
        return codigoEvaluacion;
    }

    public void setCodigoEvaluacion(pccSistemaEvaluacionTipo codigoEvaluacion) {
        this.codigoEvaluacion = codigoEvaluacion;
    }

    @ManyToOne
    @JoinColumn(name = "codevaluacion", referencedColumnName = "ID")
    private pccSistemaEvaluacionTipo codigoEvaluacion;

    @Column(name="peso",length = 5)
    private Short peso;

    @Column(name="SITUACIONREGISTRO",length = 1)
    private String estadoRegistro;

    public Integer getId_Se() {
        return id_Se;
    }

    public void setId_Se(Integer id_Se) {
        this.id_Se = id_Se;
    }


    public Short getPeso() {
        return peso;
    }

    public void setPeso(Short peso) {
        this.peso = peso;
    }

    public String getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }
}
