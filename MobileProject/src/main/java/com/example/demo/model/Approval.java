package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author lutfi
 */
@Entity
public class Approval extends Additional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipe_approval")
    private String tipeApproval;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Approval(){
        this.setStatus("Active");
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
        if (!(object instanceof Approval)) {
            return false;
        }
        Approval other = (Approval) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Approval[ id=" + getId() + " ]";
    }

    public String getTipeApproval() {
        return tipeApproval;
    }

    public void setTipeApproval(String tipeApproval) {
        this.tipeApproval = tipeApproval;
    }

    /**
     * @return the tipe_approval
     */

    
}
