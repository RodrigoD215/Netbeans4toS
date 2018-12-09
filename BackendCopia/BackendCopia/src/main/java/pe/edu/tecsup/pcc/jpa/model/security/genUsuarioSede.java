package pe.edu.tecsup.pcc.jpa.model.security;

import temporal.PersonEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jpizarro on 23/05/2017.
 */
@Entity
@Table(name="GEN_USUARIO_SEDE")
public class genUsuarioSede implements Serializable{
    @Id
    @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
    private Long id;

    @Column(name="SEDE",length = 1)
    String sede;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public genUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(genUsuario usuario) {
        this.usuario = usuario;
    }

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
    genUsuario usuario;

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
