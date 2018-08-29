package com.example.demo.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author rasyid
 */
@Entity
public class Karyawan extends Additional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "kode_karyawan")
    private String kodeKaryawan;
    @Column(name = "noe_rekening")
    private String noRekening;
    @Column(name = "nama_rekening")
    private String namaRekening;
    @Column(name = "join_date")
    private Date joinDate;
    @ManyToOne
    private Venue venue;
    @OneToOne(mappedBy = "karyawan")
    private DataLogin dataLogin;
    @ManyToOne
    private AkunBank akunBank;
    @ManyToOne
    private Jabatan jabatan;
    @ManyToOne
    private Team team;
    @ManyToOne
    private TipeKaryawan tipeKaryawan;
    @ManyToOne
    private TimeGroup timeGroup;

    public TimeGroup getTimeGroup() {
		return timeGroup;
	}

	public void setTimeGroup(TimeGroup timeGroup) {
		this.timeGroup = timeGroup;
	}

	public Karyawan(Long id, String last_name, String first_name, String kode_karyawan, String no_rekening, String nama_rekening) {
        this.setId(id);
        this.setLastName(last_name);
        this.setFirstName(first_name);
        this.setKodeKaryawan(kode_karyawan);
        this.setNoRekening(no_rekening);
        this.setNamaRekening(nama_rekening);
        this.setStatus("Active");
    }

    public Karyawan(Long id, String last_name, String first_name, String kode_karyawan) {
        this.setId(id);
        this.setLastName(last_name);
        this.setFirstName(first_name);
        this.setKodeKaryawan(kode_karyawan);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public Karyawan(Long id, String last_name) {
        this.setId(id);
        this.setLastName(last_name);
    }

    public Karyawan() {
    }
    
    public String getFullName() {
		return this.getFirstName()+" "+this.getLastName();
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
        if (!(object instanceof Karyawan)) {
            return false;
        }
        Karyawan other = (Karyawan) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Karyawan[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return the last_name
     */

    /**
     * @return the venue
     */
    public Venue getVenue() {
        return venue;
    }

    /**
     * @param venue the venue to set
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
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

    /**
     * @return the akunBank
     */
    public AkunBank getAkunBank() {
        return akunBank;
    }

    /**
     * @param akunBank the akunBank to set
     */
    public void setAkunBank(AkunBank akunBank) {
        this.akunBank = akunBank;
    }

    /**
     * @return the jabatan
     */
    public Jabatan getJabatan() {
        return jabatan;
    }

    /**
     * @param jabatan the jabatan to set
     */
    public void setJabatan(Jabatan jabatan) {
        this.jabatan = jabatan;
    }

    /**
     * @return the team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(Team team) {
        this.team = team;
    }

    /**
     * @return the tipeKaryawan
     */
    public TipeKaryawan getTipeKaryawan() {
        return tipeKaryawan;
    }

    /**
     * @param tipeKaryawan the tipeKaryawan to set
     */
    public void setTipeKaryawan(TipeKaryawan tipeKaryawan) {
        this.tipeKaryawan = tipeKaryawan;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getKodeKaryawan() {
        return kodeKaryawan;
    }

    public void setKodeKaryawan(String kodeKaryawan) {
        this.kodeKaryawan = kodeKaryawan;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getNamaRekening() {
        return namaRekening;
    }

    public void setNamaRekening(String namaRekening) {
        this.namaRekening = namaRekening;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
