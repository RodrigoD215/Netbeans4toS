package pe.edu.tecsup.pcc.jpa.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by jpizarro on 2/05/2017.
 */
@Entity
@Table(name="PCC_SISTEMA_EVALUACION")
public class pccSistemaEvaluacion implements Serializable{
    @Id
    @Column(name="ID_SE")
    Integer codSe;

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    private String comentario;
    public int getCodSe() {
        return codSe;
    }

    public void setCodSe(int codSe) {
        this.codSe = codSe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   private String descripcion;



}
