package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rule {
	
	@Id
	Long id;
	@ManyToOne
	TipePengajuan tipePengajuan;
	@ManyToOne
	Status status;
	@ManyToOne
	Status nextStatus;
	@ManyToOne
	Karyawan nextBy;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Karyawan getNextBy() {
		return nextBy;
	}
	public void setNextBy(Karyawan nextBy) {
		this.nextBy = nextBy;
	}
	public TipePengajuan getTipePengajuan() {
		return tipePengajuan;
	}
	public void setTipePengajuan(TipePengajuan tipePengajuan) {
		this.tipePengajuan = tipePengajuan;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Status getNextStatus() {
		return nextStatus;
	}
	public void setNextStatus(Status nextStatus) {
		this.nextStatus = nextStatus;
	}

}
