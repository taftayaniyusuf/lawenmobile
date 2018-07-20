package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ExpenseKategoriDao;
import com.example.demo.model.ExpenseKategori;
import com.example.demo.repository.ExpenseKategoriRepository;

@Service
public class ExpenseKategoriService implements ExpenseKategoriDao{
	
	@Autowired
	ExpenseKategoriRepository ekr;
	
	@Override
	public ExpenseKategori getKategori(Long id) {
		return ekr.findById(id).get();
	}

}
