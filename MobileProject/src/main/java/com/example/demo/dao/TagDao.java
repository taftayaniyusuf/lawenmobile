package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Tag;

public interface TagDao {

	public Tag getTag(Long id);
	public List<Tag> getAll();
}
