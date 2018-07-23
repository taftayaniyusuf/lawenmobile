package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Status;

public interface StatusDao {

	public String getNamaStatus(Long id);
	public Status getStatus(Long id);
	public Status getDraft();
	public Status getSent();
	public List<Status> getAllStatus();
    public Status getById(long id);
    public void SaveOrUpdate(Status a);
    public void deleteStatus(long id);
    public void deleteStatus(Status a);
}
