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
public class Venue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nama_venue;
    private String deskripsi_venue;
    private String alamat_venue;
    private Float latitude_venue;
    private Float longitude_venue;
    private Float radius_venue;
    @OneToMany(mappedBy = "venue")
    private List<Karyawan> karyawans;


    public Venue(Long id, String nama_venue, String deskripsi_venue, String alamat_venue, Float latitude_venue) {
        this.id = id;
        this.nama_venue = nama_venue;
        this.deskripsi_venue = deskripsi_venue;
        this.alamat_venue = alamat_venue;
        this.latitude_venue = latitude_venue;
    }

    public Venue(Long id, String nama_venue, String deskripsi_venue, String alamat_venue) {
        this.id = id;
        this.nama_venue = nama_venue;
        this.deskripsi_venue = deskripsi_venue;
        this.alamat_venue = alamat_venue;
    }

    public Venue() {
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
        if (!(object instanceof Venue)) {
            return false;
        }
        Venue other = (Venue) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Venue[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return the nama_venue
     */
    public String getNama_venue() {
        return nama_venue;
    }

    /**
     * @param nama_venue the nama_venue to set
     */
    public void setNama_venue(String nama_venue) {
        this.nama_venue = nama_venue;
    }

    /**
     * @return the deskripsi_venue
     */
    public String getDeskripsi_venue() {
        return deskripsi_venue;
    }

    /**
     * @param deskripsi_venue the deskripsi_venue to set
     */
    public void setDeskripsi_venue(String deskripsi_venue) {
        this.deskripsi_venue = deskripsi_venue;
    }

    /**
     * @return the alamat_venue
     */
    public String getAlamat_venue() {
        return alamat_venue;
    }

    /**
     * @param alamat_venue the alamat_venue to set
     */
    public void setAlamat_venue(String alamat_venue) {
        this.alamat_venue = alamat_venue;
    }

    /**
     * @return the latitude_venue
     */
    public Float getLatitude_venue() {
        return latitude_venue;
    }

    /**
     * @param latitude_venue the latitude_venue to set
     */
    public void setLatitude_venue(Float latitude_venue) {
        this.latitude_venue = latitude_venue;
    }

    /**
     * @return the longitude_venue
     */
    public Float getLongitude_venue() {
        return longitude_venue;
    }

    /**
     * @param longitude_venue the longitude_venue to set
     */
    public void setLongitude_venue(Float longitude_venue) {
        this.longitude_venue = longitude_venue;
    }

    /**
     * @return the radius_venue
     */
    public Float getRadius_venue() {
        return radius_venue;
    }

    /**
     * @param radius_venue the radius_venue to set
     */
    public void setRadius_venue(Float radius_venue) {
        this.radius_venue = radius_venue;
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

}
