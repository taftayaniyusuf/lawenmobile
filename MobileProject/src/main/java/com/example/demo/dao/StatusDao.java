package com.example.demo.dao;

import com.example.demo.model.Status;

public interface StatusDao {

	public String getNamaStatus(Long id);
	public Status getStatus(Long id);
	public Status getDraft();
	public Status getSent();
}
