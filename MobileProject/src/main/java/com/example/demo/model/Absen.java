/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author lutfi
 */
@Entity
public class Absen extends Additional implements Serializable {

    @OneToMany(mappedBy = "absen")
    private List<MasukTambahan> masukTambahan;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "tanggal")
    private Date tanggal;
    @Column(name = "keterlambatan")
    private Time keterlambatan;
    @Column(name = "total_jam_kerja")
    private Time total_jam_kerja;
    @Column(name = "foto_path")
    private String foto_path;
    @ManyToOne
    private Masuk masuk;
    @ManyToOne
    private Pulang pulang;
	@ManyToOne
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Absen)) {
            return false;
        }
        Absen other = (Absen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Absen[ id=" + id + " ]";
    }

    /**
     * @return the masukTambahan
     */
    public List<MasukTambahan> getMasukTambahan() {
        return masukTambahan;
    }

    /**
     * @param masukTambahan the masukTambahan to set
     */
    public void setMasukTambahan(List<MasukTambahan> masukTambahan) {
        this.masukTambahan = masukTambahan;
    }

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

    /**
     * @return the keterlambatan
     */
    public Time getKeterlambatan() {
        return keterlambatan;
    }

    /**
     * @param keterlambatan the keterlambatan to set
     */
    public void setKeterlambatan(Time keterlambatan) {
        this.keterlambatan = keterlambatan;
    }

    /**
     * @return the total_jam_kerja
     */
    public Time getTotal_jam_kerja() {
        return total_jam_kerja;
    }

    /**
     * @param total_jam_kerja the total_jam_kerja to set
     */
    public void setTotal_jam_kerja(Time total_jam_kerja) {
        this.total_jam_kerja = total_jam_kerja;
    }

    /**
     * @return the foto_path
     */
    public String getFoto_path() {
        return foto_path;
    }

    /**
     * @param foto_path the foto_path to set
     */
    public void setFoto_path(String foto_path) {
        this.foto_path = foto_path;
    }

    /**
     * @return the masuk
     */
    public Masuk getMasuk() {
        return masuk;
    }

    /**
     * @param masuk the masuk to set
     */
    public void setMasuk(Masuk masuk) {
        this.masuk = masuk;
    }

    /**
     * @return the pulang
     */
    public Pulang getPulang() {
        return pulang;
    }

    /**
     * @param pulang the pulang to set
     */
    public void setPulang(Pulang pulang) {
        this.pulang = pulang;
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
