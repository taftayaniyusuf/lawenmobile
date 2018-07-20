package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TipePengajuanDao;
import com.example.demo.model.TipePengajuan;
import com.example.demo.repository.TipePengajuanRepository;

@Service
public class TipePengajuanService implements TipePengajuanDao{
	
	@Autowired
	TipePengajuanRepository tpr;
	
	@Override
	public TipePengajuan getTipe(Long id) {
		return tpr.getById(id);
	}

}
