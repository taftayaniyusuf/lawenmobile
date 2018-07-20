package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tag implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtag")
	Long id;
	@Column(name = "nama_tag", insertable = true, length = 35, nullable = false, unique = true, updatable = true)
	String namaTag;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNamaTag() {
		return namaTag;
	}
	public void setNamaTag(String namaTag) {
		this.namaTag = namaTag;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
