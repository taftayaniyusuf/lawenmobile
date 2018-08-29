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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lutfi
 */
@Entity
public class Pengingat extends Additional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nama_pengingat")
    private String namaPengingat;
    @Temporal(TemporalType.TIME)
    @Column(name = "waktu_pengingat")
    private Date waktuPengingat;
    @Column(name = "deskripsi_pengingat")
    private String deskripsiPengingat;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Pengingat(){
        this.setStatus("Active");
        this.setWaktuPengingat(new Date());
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
        if (!(object instanceof Pengingat)) {
            return false;
        }
        Pengingat other = (Pengingat) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pengingat[ id=" + getId() + " ]";
    }


    public String getNamaPengingat() {
        return namaPengingat;
    }

    public void setNamaPengingat(String namaPengingat) {
        this.namaPengingat = namaPengingat;
    }

    public Date getWaktuPengingat() {
        return waktuPengingat;
    }

    public void setWaktuPengingat(Date waktuPengingat) {
        this.waktuPengingat = waktuPengingat;
    }

    public String getDeskripsiPengingat() {
        return deskripsiPengingat;
    }

    public void setDeskripsiPengingat(String deskripsiPengingat) {
        this.deskripsiPengingat = deskripsiPengingat;
    }
}
