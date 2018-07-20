package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PengajuanDana")
public class PengajuanDana implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpengajuan")
	Long id;
	@Column(name = "title_pengajuan", length = 35, insertable = true, updatable = true)
	String titlePengajuan;
	@Column(name = "amount", insertable = true, updatable = true)
	Integer amount;
	@Column(name = "date_from", insertable = true, updatable = true)
	Date dateFrom;
	@Column(name = "date_to", insertable = true, updatable = true)
	Date dateTo;
	@Column(name = "lattitide", insertable = true, updatable = false)
	Float lattitude;
	@Column(name = "longitude", insertable = true, updatable = false)
	Float longitude;
	@Column(name = "foto", length = 100, insertable = true, updatable = true)
	String foto;
	@Column(name = "deskripsi_pengajuan", length = 200, insertable = true, updatable = false)
	String deskripsiPengajuan;
	@Column(name = "tipe_pembayaran", length = 15, insertable = true, updatable = true)
	String tipePembayaran;
	@Column(name = "update_by", length = 35, insertable = true, updatable = true)
	String updateBy;
	@Column(name = "update_date_pengajuan", insertable = true, updatable = true)
	Date updateDatePengajuan;
	@OneToMany(mappedBy="pengajuanDana")
	List<Log> logs;
	@OneToOne
	@JoinColumn(name = "idtag", referencedColumnName = "idtag")
	Tag tag;
	@ManyToOne
	@JoinColumn(name = "idkaryawan", referencedColumnName = "id")
	Karyawan karyawan;
	@OneToOne
	@JoinColumn(name = "idexpense", referencedColumnName = "idexpense")
	ExpenseKategori expense;
	@ManyToOne
	@JoinColumn(name = "idstatus", referencedColumnName = "idstatus")
	Status status;
	@OneToOne
	@JoinColumn(name = "idtipepengajuan", referencedColumnName = "idtipepengajuan")
	TipePengajuan tipePengajuan;
	
	
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	public Karyawan getKaryawan() {
		return karyawan;
	}
	public void setKaryawan(Karyawan karyawan) {
		this.karyawan = karyawan;
	}
	public ExpenseKategori getExpense() {
		return expense;
	}
	public void setExpense(ExpenseKategori expense) {
		this.expense = expense;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public TipePengajuan getTipePengajuan() {
		return tipePengajuan;
	}
	public void setTipePengajuan(TipePengajuan tipePengajuan) {
		this.tipePengajuan = tipePengajuan;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Log> getLogs() {
		return logs;
	}
	public void setLogs(List<Log> logs) {
		this.logs = logs;
	}
	public String getTitlePengajuan() {
		return titlePengajuan;
	}
	public void setTitlePengajuan(String titlePengajuan) {
		this.titlePengajuan = titlePengajuan;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public Float getLattitude() {
		return lattitude;
	}
	public void setLattitude(Float lattitude) {
		this.lattitude = lattitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getDeskripsiPengajuan() {
		return deskripsiPengajuan;
	}
	public void setDeskripsiPengajuan(String deskripsiPengajuan) {
		this.deskripsiPengajuan = deskripsiPengajuan;
	}
	public String getTipePembayaran() {
		return tipePembayaran;
	}
	public void setTipePembayaran(String tipePembayaran) {
		this.tipePembayaran = tipePembayaran;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
