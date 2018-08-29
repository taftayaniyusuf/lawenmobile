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
public class Jabatan extends Additional implements Serializable {
    @JsonIgnore
    @OneToMany(mappedBy = "jabatan")
    private List<Karyawan> karyawans;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nama_jabatan")
    private String namaJabatan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Jabatan(){
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
        if (!(object instanceof Jabatan)) {
            return false;
        }
        Jabatan other = (Jabatan) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Jabatan[ id=" + getId() + " ]";
    }

    /**
     * @return the karyawans
     */
    public List<Karyawan> getKaryawans() {
        return karyawans;
    }

    /**
     * @param karyawans the karyawans to set
     */
    public void setKaryawans(List<Karyawan> karyawans) {
        this.karyawans = karyawans;
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNamaJabatan() {
        return namaJabatan;
    }

    public void setNamaJabatan(String namaJabatan) {
        this.namaJabatan = namaJabatan;
    }

    /**
     * @return the nama_jabatan
     */


}

