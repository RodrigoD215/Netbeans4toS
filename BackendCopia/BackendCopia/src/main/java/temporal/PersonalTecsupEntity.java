package temporal;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by jpizarro on 23/05/2017.
 */
@Entity
@Table(name = "PERSONAL_TECSUP", schema = "TECSUP", catalog = "")
public class PersonalTecsupEntity {
    private long idPerson;
    private String pass;
    private String codTecsup;
    private String passEnc;
    private Long idJefe;
    private String estado;
    private Long idSede;
    private String docente;
    private String emailLaboral;
    private Time fechaIngreso;
    private PersonEntity personByIdPerson;

    @Id
    @Column(name = "ID_PERSON", nullable = false, precision = 0)
    public long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }


    @OneToOne
    @JoinColumn(name = "ID_PERSON", referencedColumnName = "ID_PERSON", nullable = false)
    public PersonEntity getPersonByIdPerson() {
        return personByIdPerson;
    }

    public void setPersonByIdPerson(PersonEntity personByIdPerson) {
        this.personByIdPerson = personByIdPerson;
    }


    @Basic
    @Column(name = "PASS", nullable = true, length = 100)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "COD_TECSUP", nullable = false, length = 10)
    public String getCodTecsup() {
        return codTecsup;
    }

    public void setCodTecsup(String codTecsup) {
        this.codTecsup = codTecsup;
    }

    @Basic
    @Column(name = "PASS_ENC", nullable = true, length = 200)
    public String getPassEnc() {
        return passEnc;
    }

    public void setPassEnc(String passEnc) {
        this.passEnc = passEnc;
    }

    @Basic
    @Column(name = "ID_JEFE", nullable = true, precision = 0)
    public Long getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Long idJefe) {
        this.idJefe = idJefe;
    }

    @Basic
    @Column(name = "ESTADO", nullable = true, length = 1)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "ID_SEDE", nullable = true, precision = 0)
    public Long getIdSede() {
        return idSede;
    }

    public void setIdSede(Long idSede) {
        this.idSede = idSede;
    }

    @Basic
    @Column(name = "DOCENTE", nullable = true, length = 1)
    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Basic
    @Column(name = "EMAIL_LABORAL", nullable = true, length = 100)
    public String getEmailLaboral() {
        return emailLaboral;
    }

    public void setEmailLaboral(String emailLaboral) {
        this.emailLaboral = emailLaboral;
    }

    @Basic
    @Column(name = "FECHA_INGRESO", nullable = true)
    public Time getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Time fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalTecsupEntity that = (PersonalTecsupEntity) o;

        if (idPerson != that.idPerson) return false;
        if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;
        if (codTecsup != null ? !codTecsup.equals(that.codTecsup) : that.codTecsup != null) return false;
        if (passEnc != null ? !passEnc.equals(that.passEnc) : that.passEnc != null) return false;
        if (idJefe != null ? !idJefe.equals(that.idJefe) : that.idJefe != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (idSede != null ? !idSede.equals(that.idSede) : that.idSede != null) return false;
        if (docente != null ? !docente.equals(that.docente) : that.docente != null) return false;
        if (emailLaboral != null ? !emailLaboral.equals(that.emailLaboral) : that.emailLaboral != null) return false;
        if (fechaIngreso != null ? !fechaIngreso.equals(that.fechaIngreso) : that.fechaIngreso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idPerson ^ (idPerson >>> 32));
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (codTecsup != null ? codTecsup.hashCode() : 0);
        result = 31 * result + (passEnc != null ? passEnc.hashCode() : 0);
        result = 31 * result + (idJefe != null ? idJefe.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (idSede != null ? idSede.hashCode() : 0);
        result = 31 * result + (docente != null ? docente.hashCode() : 0);
        result = 31 * result + (emailLaboral != null ? emailLaboral.hashCode() : 0);
        result = 31 * result + (fechaIngreso != null ? fechaIngreso.hashCode() : 0);
        return result;
    }


}
