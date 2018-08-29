/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lutfi
 */
@Entity
public class Libur extends Additional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "nama_libur")
    private String namaLibur;
    @Column(name = "tanggal")
    private Date tanggal;
    @Column(name = "deskripsi_libur")
    private String deskripsiLibur;

    public  Libur(){
        this.setStatus("Active");
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
        if (!(object instanceof Libur)) {
            return false;
        }
        Libur other = (Libur) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Libur[ id=" + getId() + " ]";
    }

    /**
     * @return the nama_libur
     */


    /**
     * @return the tanggal
     */
    public Date getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getNamaLibur() {
        return namaLibur;
    }

    public void setNamaLibur(String namaLibur) {
        this.namaLibur = namaLibur;
    }

    public String getDeskripsiLibur() {
        return deskripsiLibur;
    }

    public void setDeskripsiLibur(String deskripsiLibur) {
        this.deskripsiLibur = deskripsiLibur;
    }

    /**
     * @return the deskripsi_libur
     */

    
}
