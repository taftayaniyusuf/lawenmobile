package com.example.demo.model;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author rasyid
 */
@Entity
public class Team implements Serializable {

    @OneToMany(mappedBy = "team")
    private List<Karyawan> karyawans;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nama_teamS;

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
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Team[ id=" + getId() + " ]";
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

    /**
     * @return the nama_teamS
     */
    public String getNama_teamS() {
        return nama_teamS;
    }

    /**
     * @param nama_teamS the nama_teamS to set
     */
    public void setNama_teamS(String nama_teamS) {
        this.nama_teamS = nama_teamS;
    }

}
