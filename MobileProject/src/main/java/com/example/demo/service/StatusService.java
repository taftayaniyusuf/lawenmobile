package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StatusDao;
import com.example.demo.model.Status;
import com.example.demo.repository.StatusRepository;

@Service
public class StatusService implements StatusDao{

	@Autowired
	StatusRepository sr;
	
	@Override
	public String getNamaStatus(Long id) {
		return sr.getById(id).getNamaStatus();
	}
	
	@Override
	public Status getStatus(Long id) {
		return sr.getById(id);
	}
	
	@Override
	public Status getDraft() {
		return sr.getById(1L);
	}
	
	@Override
	public Status getSent() {
		return sr.getById(2L);
	}
}
