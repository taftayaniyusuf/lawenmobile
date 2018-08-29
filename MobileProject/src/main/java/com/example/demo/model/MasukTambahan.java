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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lutfi
 */
@Entity
public class MasukTambahan extends Additional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_masuk_tambahan", unique = true, nullable = false)
    private Long idMasukTambahan;
    @Temporal(TemporalType.TIME)
    @Column(name = "jam_masuk_tambahan")
    private Date jamMasukTambahan;
    @Column(name = "latitude_masuk_tambahan")
    private Float latitudeMasukTambahan;
    @Column(name = "longitude_masuk_tambahan")
    private Float longitudeMasukTambahan;
    @ManyToOne
    private Absen absen;
    public MasukTambahan(){
        this.setStatus("Active");
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public Long getIdMasukTambahan() {
        return idMasukTambahan;
    }

    public void setIdMasukTambahan(Long idMasukTambahan) {
        this.idMasukTambahan = idMasukTambahan;
    }

    public Date getJamMasukTambahan() {
        return jamMasukTambahan;
    }

    public void setJamMasukTambahan(Date jamMasukTambahan) {
        this.jamMasukTambahan = jamMasukTambahan;
    }

    public Float getLatitudeMasukTambahan() {
        return latitudeMasukTambahan;
    }

    public void setLatitudeMasukTambahan(Float latitudeMasukTambahan) {
        this.latitudeMasukTambahan = latitudeMasukTambahan;
    }

    public Float getLongitudeMasukTambahan() {
        return longitudeMasukTambahan;
    }

    public void setLongitudeMasukTambahan(Float longitudeMasukTambahan) {
        this.longitudeMasukTambahan = longitudeMasukTambahan;
    }

    public Absen getAbsen() {
        return absen;
    }

    public void setAbsen(Absen absen) {
        this.absen = absen;
    }
}
