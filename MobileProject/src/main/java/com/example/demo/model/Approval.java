package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lutfi
 */
@Entity
public class Approval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipe_approval;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Approval)) {
            return false;
        }
        Approval other = (Approval) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Approval[ id=" + id + " ]";
    }

    /**
     * @return the tipe_approval
     */
    public String getTipe_approval() {
        return tipe_approval;
    }

    /**
     * @param tipe_approval the tipe_approval to set
     */
    public void setTipe_approval(String tipe_approval) {
        this.tipe_approval = tipe_approval;
    }
    
}
