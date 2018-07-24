package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ExpenseApproval extends Additional implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private ExpenseKategori expenseKategori;
	@ManyToOne
	private Approval approval;
	@ManyToOne
	private Karyawan karyawan;
	@Column(name = "nama_approval")
	private String nama_approval;
	@Column(name = "Role")
	private String Role;
	
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
	        if (!(object instanceof Absen)) {
	            return false;
	        }
	        ExpenseApproval other = (ExpenseApproval) object;
	        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "model.ExpenseApproval[ id=" + getId() + " ]";
	    }
	    
	 /**
     * @return the expenseKategori
     */
    public ExpenseKategori getExpenseKategori() {
        return expenseKategori;
    }

    /**
     * @param expenseKategori the expenseKategori to set
     */
    public void setExpenseKategori(ExpenseKategori expenseKategori) {
        this.expenseKategori = expenseKategori;
    }

    /**
     * @return the approval
     */
    public Approval getApproval() {
        return approval;
    }

    /**
     * @param approval the approval to set
     */
    public void setApproval(Approval approval) {
        this.approval = approval;
    }

    /**
     * @return the karyawan
     */
    public Karyawan getKaryawan() {
        return karyawan;
    }

    /**
     * @param karyawan the karyawan to set
     */
    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    /**
     * @return the nama_approval
     */
    public String getNama_approval() {
        return nama_approval;
    }

    /**
     * @param nama_approval the nama_approval to set
     */
    public void setNama_approval(String nama_approval) {
        this.nama_approval = nama_approval;
    }

    /**
     * @return the Role
     */
    public String getRole() {
        return Role;
    }

    /**
     * @param Role the Role to set
     */
    public void setRole(String Role) {
        this.Role = Role;
    }
	
}
