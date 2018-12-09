package pe.edu.tecsup.pcc.jpa.model;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by jpizarro on 11/05/2017.
 */
@Entity
@Table(name="PCC_PROGRAMACION_MODULOS")
public class pccProgramacionModulos   implements Serializable {
    public pccProgramacionModulosPK getKey() {
        return key;
    }

    public void setKey(pccProgramacionModulosPK key) {
        this.key = key;
    }

    @EmbeddedId

    private pccProgramacionModulosPK key;
}
