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
public class TipeKaryawan extends Additional implements Serializable {
    @JsonIgnore
    @OneToMany(mappedBy = "tipeKaryawan")
    private List<Karyawan> karyawans;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nama_typekaryawan")
    private String namaTypeKaryawan;
    public TipeKaryawan(){
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
        if (!(object instanceof TipeKaryawan)) {
            return false;
        }
        TipeKaryawan other = (TipeKaryawan) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TipeKaryawan[ id=" + getId() + " ]";
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

    public String getNamaTypeKaryawan() {
        return namaTypeKaryawan;
    }

    public void setNamaTypeKaryawan(String namaTypeKaryawan) {
        this.namaTypeKaryawan = namaTypeKaryawan;
    }

    /**
     * @return the nama_typekaryawan
     */


}
