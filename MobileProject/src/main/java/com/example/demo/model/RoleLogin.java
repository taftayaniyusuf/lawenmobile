package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


/**
 *
 * @author rasyid
 */
@Entity
public class RoleLogin implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nama_role;
    @OneToOne
    private DataLogin dataLogin;

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
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
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
    public String getNama_role() {
        return nama_role;
    }

    /**
     * @param nama_role the nama_role to set
     */
    public void setNama_role(String nama_role) {
        this.nama_role = nama_role;
    }

    /**
     * @return the dataLogin
     */
    public DataLogin getDataLogin() {
        return dataLogin;
    }

    /**
     * @param dataLogin the dataLogin to set
     */
    public void setDataLogin(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

}
