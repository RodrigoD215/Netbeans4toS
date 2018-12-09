package temporal;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by jpizarro on 23/05/2017.
 */
@Entity
@Table(name = "PERSON", schema = "TECSUP", catalog = "")
public class PersonEntity {
    private long idPerson;
    private String nroDoc;
    private String nombres;
    private String apellidoPat;
    private String apellidoMat;
    private Long idTipoDoc;
    private Time fecNac;
    private String sexo;
    private String direccion;
    private String telefono;
    private String celular;
    private String emailPersonal;
    private String estadocivil;
    private String emailTrabajo;
    private Long codOracleLima;
    private PersonalTecsupEntity personalTecsupByIdPerson;

    @Id
    @Column(name = "ID_PERSON", nullable = false, precision = 0)
    public long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }


    @OneToOne(mappedBy = "personByIdPerson")
    public PersonalTecsupEntity getPersonalTecsupByIdPerson() {
        return personalTecsupByIdPerson;
    }

    public void setPersonalTecsupByIdPerson(PersonalTecsupEntity personalTecsupByIdPerson) {
        this.personalTecsupByIdPerson = personalTecsupByIdPerson;
    }

    @Basic
    @Column(name = "NRO_DOC", nullable = true, length = 20)
    public String getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    @Basic
    @Column(name = "NOMBRES", nullable = true, length = 40)
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "APELLIDO_PAT", nullable = true, length = 50)
    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    @Basic
    @Column(name = "APELLIDO_MAT", nullable = true, length = 50)
    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    @Basic
    @Column(name = "ID_TIPO_DOC", nullable = true, precision = 0)
    public Long getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(Long idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    @Basic
    @Column(name = "FEC_NAC", nullable = true)
    public Time getFecNac() {
        return fecNac;
    }

    public void setFecNac(Time fecNac) {
        this.fecNac = fecNac;
    }

    @Basic
    @Column(name = "SEXO", nullable = true, length = 1)
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "DIRECCION", nullable = true, length = 150)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "TELEFONO", nullable = true, length = 50)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "CELULAR", nullable = true, length = 50)
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "EMAIL_PERSONAL", nullable = true, length = 100)
    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    @Basic
    @Column(name = "ESTADOCIVIL", nullable = true, length = 1)
    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    @Basic
    @Column(name = "EMAIL_TRABAJO", nullable = true, length = 100)
    public String getEmailTrabajo() {
        return emailTrabajo;
    }

    public void setEmailTrabajo(String emailTrabajo) {
        this.emailTrabajo = emailTrabajo;
    }

    @Basic
    @Column(name = "COD_ORACLE_LIMA", nullable = true, precision = 0)
    public Long getCodOracleLima() {
        return codOracleLima;
    }

    public void setCodOracleLima(Long codOracleLima) {
        this.codOracleLima = codOracleLima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (idPerson != that.idPerson) return false;
        if (nroDoc != null ? !nroDoc.equals(that.nroDoc) : that.nroDoc != null) return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (apellidoPat != null ? !apellidoPat.equals(that.apellidoPat) : that.apellidoPat != null) return false;
        if (apellidoMat != null ? !apellidoMat.equals(that.apellidoMat) : that.apellidoMat != null) return false;
        if (idTipoDoc != null ? !idTipoDoc.equals(that.idTipoDoc) : that.idTipoDoc != null) return false;
        if (fecNac != null ? !fecNac.equals(that.fecNac) : that.fecNac != null) return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (celular != null ? !celular.equals(that.celular) : that.celular != null) return false;
        if (emailPersonal != null ? !emailPersonal.equals(that.emailPersonal) : that.emailPersonal != null)
            return false;
        if (estadocivil != null ? !estadocivil.equals(that.estadocivil) : that.estadocivil != null) return false;
        if (emailTrabajo != null ? !emailTrabajo.equals(that.emailTrabajo) : that.emailTrabajo != null) return false;
        if (codOracleLima != null ? !codOracleLima.equals(that.codOracleLima) : that.codOracleLima != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idPerson ^ (idPerson >>> 32));
        result = 31 * result + (nroDoc != null ? nroDoc.hashCode() : 0);
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (apellidoPat != null ? apellidoPat.hashCode() : 0);
        result = 31 * result + (apellidoMat != null ? apellidoMat.hashCode() : 0);
        result = 31 * result + (idTipoDoc != null ? idTipoDoc.hashCode() : 0);
        result = 31 * result + (fecNac != null ? fecNac.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (emailPersonal != null ? emailPersonal.hashCode() : 0);
        result = 31 * result + (estadocivil != null ? estadocivil.hashCode() : 0);
        result = 31 * result + (emailTrabajo != null ? emailTrabajo.hashCode() : 0);
        result = 31 * result + (codOracleLima != null ? codOracleLima.hashCode() : 0);
        return result;
    }


}
