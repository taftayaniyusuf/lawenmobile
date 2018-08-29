package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author rasyid
 */
@Entity
public class Venue extends Additional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nama_venue")
    private String namaVenue;
    @Column(name = "deskripsi_venue" )
    private String deskripsiVenue;
    @Column(name = "alamat_venue")
    private String alamatVenue;
    @Column(name = "latitude_venue")
    private Double latitudeVenue;
    @Column(name = "longitude_venue")
    private Double longitudeVenue;
    @Column(name = "radius_venue")
    private Double radiusVenue;
    @JsonIgnore
    @OneToMany(mappedBy = "venue")
    private List<Karyawan> karyawans;


    public Venue(Long id, String nama_venue, String deskripsi_venue, String alamat_venue,DecimalFormat latitude_venue) {
        this.setId(id);

        this.setStatus("Active");
    }

    public Venue(Long id, String nama_venue, String deskripsi_venue, String alamat_venue) {
        this.setId(id);

    }

    public Venue() {
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
        if (!(object instanceof Venue)) {
            return false;
        }
        Venue other = (Venue) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
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


    public String getNamaVenue() {
        return namaVenue;
    }

    public void setNamaVenue(String namaVenue) {
        this.namaVenue = namaVenue;
    }

    public String getDeskripsiVenue() {
        return deskripsiVenue;
    }

    public void setDeskripsiVenue(String deskripsiVenue) {
        this.deskripsiVenue = deskripsiVenue;
    }

    public String getAlamatVenue() {
        return alamatVenue;
    }

    public void setAlamatVenue(String alamatVenue) {
        this.alamatVenue = alamatVenue;
    }

    public Double getLatitudeVenue() {
        return latitudeVenue;
    }

    public void setLatitudeVenue(Double latitudeVenue) {
        this.latitudeVenue = latitudeVenue;
    }

    public Double getLongitudeVenue() {
        return longitudeVenue;
    }

    public void setLongitudeVenue(Double longitudeVenue) {
        this.longitudeVenue = longitudeVenue;
    }

    public Double getRadiusVenue() {
        return radiusVenue;
    }

    public void setRadiusVenue(Double radiusVenue) {
        this.radiusVenue = radiusVenue;
    }
}
