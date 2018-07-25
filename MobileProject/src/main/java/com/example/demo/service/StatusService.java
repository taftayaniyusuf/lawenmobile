package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Status> getAllStatus() {
		List<Status> ls=new ArrayList<>();
		sr.findAll().forEach(ls::add);
		return ls;
	}

	@Override
	public Status getById(long id) {
		// TODO Auto-generated method stub
		return sr.getById(id);
	}
	
	public List<Status> getStatusActive(){
        return sr.findStatusActive();
    }

	@Override
	public void SaveOrUpdate(Status a) {
		// TODO Auto-generated method stub
		sr.save(a);
	}

	@Override
	public void deleteStatus(long id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public void deleteStatus(Status a) {
		// TODO Auto-generated method stub
		sr.delete(a);
	}
	
	@Override
	public Status getApproved() {
		return sr.getById(3L);
	}

	@Override
	public Status getRejected() {
		return sr.getById(4L);
	}

	@Override
	public Status getReimbursed() {
		return sr.getById(5L);
	}

	@Override
	public Status getVerified() {
		return sr.getById(6L);
	}

	@Override
	public Status getUnverified() {
		return sr.getById(7L);
	}

	@Override
	public Status getDisbursed() {
		return sr.getById(8L);
	}

	@Override
	public Status getFinished() {
		return sr.getById(9L);
	}
}
