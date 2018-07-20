package com.example.demo.service;

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
		return tr.findById(id).get();
	}

}
