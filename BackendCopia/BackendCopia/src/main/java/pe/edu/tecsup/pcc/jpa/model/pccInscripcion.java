package pe.edu.tecsup.pcc.jpa.model;

import org.hibernate.annotations.Type;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Tabla de inscripciones
 */
@Entity
@Table(name = "PCC_INSCRIPCION")
public class pccInscripcion  implements Serializable {

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public pccProgramacion getPccProgramacionById() {
        return pccProgramacionById;
    }

    public void setPccProgramacionById(pccProgramacion pccProgramacionById) {
        this.pccProgramacionById = pccProgramacionById;
    }

    public Long getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(Long codPersona) {
        this.codPersona = codPersona;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Id
   /* @TableGenerator(name = "EVENT_GEN",
            table = "SEQUENCES_PCC",
            pkColumnName = "SEQ_NAME",
            valueColumnName = "SEQ_NUMBER",
            pkColumnValue = "SEQ_INSCRIPCION",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "EVENT_GEN")*/
    @SequenceGenerator(sequenceName = "SEQ_PCC_INSCRIPCION", name = "SEQ_PCC_INSCRIPCION")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PCC_INSCRIPCION")
    @Column(name = "ID_INSCRIPCION")
    private int idInscripcion;


    @ManyToOne
    @JoinColumn(name = "CODPRODUCTOACTIVIDAD", referencedColumnName = "CODPRODUCTOACTIVIDAD")
    private pccProgramacion pccProgramacionById;


    @Column(name = "CODPERSONA")
    private Long codPersona;


    @Column(name = "NOTA_FINAL",length = 5)
    private Double notaFinal;




}
