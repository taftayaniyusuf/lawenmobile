package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rule extends Additional {
	
	@Id
	private
	Long id;
	@ManyToOne
	private
	TipePengajuan tipePengajuan;
	@ManyToOne
	private
	Status status_now;
	@ManyToOne
	private
	Status nextStatus;
	@ManyToOne
	private
	Karyawan nextBy;
	public Rule(){
		this.setStatus("Active");
	}
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
	public Status getNextStatus() {
		return nextStatus;
	}
	public void setNextStatus(Status nextStatus) {
		this.nextStatus = nextStatus;
	}

	public Status getStatus_now() {
		return status_now;
	}

	public void setStatus_now(Status status_now) {
		this.status_now = status_now;
	}
}
