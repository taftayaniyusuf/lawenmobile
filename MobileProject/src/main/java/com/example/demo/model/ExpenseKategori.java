package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExpenseKategori implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idexpense")
	Long id;
	@Column(name = "nama_expense", length = 35, insertable = true, updatable = true)
	String namaExpense;
	@Column(name = "budget_maks", insertable = true, updatable = true)
	Integer budgetMaks;
	@Column(name = "maks_transaksi", insertable = true, updatable = true)
	Integer maksTransaksi;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNamaExpense() {
		return namaExpense;
	}
	public void setNamaExpense(String namaExpense) {
		this.namaExpense = namaExpense;
	}
	public Integer getBudgetMaks() {
		return budgetMaks;
	}
	public void setBudgetMaks(Integer budgetMaks) {
		this.budgetMaks = budgetMaks;
	}
	public Integer getMaksTransaksi() {
		return maksTransaksi;
	}
	public void setMaksTransaksi(Integer maksTransaksi) {
		this.maksTransaksi = maksTransaksi;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
