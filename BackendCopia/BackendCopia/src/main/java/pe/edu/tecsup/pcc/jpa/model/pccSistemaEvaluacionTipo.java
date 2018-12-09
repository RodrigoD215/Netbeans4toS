package pe.edu.tecsup.pcc.jpa.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by jpizarro on 26/05/2017.
 */
@Entity
@Table(name="PCC_SISTEMA_EVALUACION_TIPO")
public class pccSistemaEvaluacionTipo implements Serializable {
    @Id
   @Column(name="ID")
    private Integer idTipoEvaluacion;

    @Column(name="DESCRIPCION")
    private String descripcion;

    @Column(name="ALIAS")
    private String alias;

    @Column(name="MAX_EVALUACIONES",length = 2)
    private byte maxEvalaciones;

    public Integer getIdTipoEvaluacion() {
        return idTipoEvaluacion;
    }

    public void setIdTipoEvaluacion(Integer idTipoEvaluacion) {
        this.idTipoEvaluacion = idTipoEvaluacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
