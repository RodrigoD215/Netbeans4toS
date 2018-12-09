package pe.edu.tecsup.pcc.jpa.model.security;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "ROLES")
public class genRolSistema {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authority_seq")
    @SequenceGenerator(name = "authority_seq", sequenceName = "authority_seq", allocationSize = 1)
    private Long id;

    @Column(name = "NAME", length = 50)

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<genUsuario> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<genUsuario> getUsers() {
        return users;
    }

    public void setUsers(List<genUsuario> users) {
        this.users = users;
    }
}