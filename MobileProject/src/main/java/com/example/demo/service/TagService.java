package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TagDao;
import com.example.demo.model.Tag;
import com.example.demo.repository.TagRepository;


@Service
public class TagService implements TagDao{
	
	@Autowired
	TagRepository tr;
	
	@Override
	public Tag getTag(Long id) {
		return tr.getById(id);
	}

	@Override
	public List<Tag> getAll() {
		List<Tag> lt = new ArrayList<>();
		tr.findAll().forEach(lt::add);
		return lt;
	}
	
	public Tag saveTag(Tag t) {
		return tr.save(t);
	}
	
	public void deleteTag(Tag t) {
		tr.delete(t);
	}

	

}
