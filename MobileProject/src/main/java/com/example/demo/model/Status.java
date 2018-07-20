package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idstatus")
	Long id;
	@Column(name = "nama_status", length = 20, insertable = true, updatable = false)
	String namaStatus;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNamaStatus() {
		return namaStatus;
	}
	public void setNamaStatus(String namaStatus) {
		this.namaStatus = namaStatus;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
