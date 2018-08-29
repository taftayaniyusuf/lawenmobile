package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author rasyid
 */
@Entity
public class RoleLogin extends Additional implements Serializable {
    @JsonIgnore
    @OneToMany(mappedBy = "roleLogin")
    private List<DataLogin> dataLogins;


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nama_role")
    private String namaRole;

    public RoleLogin(){
        this.setStatus("Active");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoleLogin)) {
            return false;
        }
        RoleLogin other = (RoleLogin) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.RoleLogin[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return the nama_role
     */

    public List<DataLogin> getDataLogins() {
        return dataLogins;
    }

    public void setDataLogins(List<DataLogin> dataLogins) {
        this.dataLogins = dataLogins;
    }

    public String getNamaRole() {
        return namaRole;
    }

    public void setNamaRole(String namaRole) {
        this.namaRole = namaRole;
    }

    /**
     * @return the dataLogin
     */


}
