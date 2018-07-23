package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Tag;



public interface TagDao {

<<<<<<< HEAD
    public List<Tag> getAllTag();
    public Tag getById(long id);
    public void SaveOrUpdate(Tag a);
    public void deleteTag(long id);
    public void deleteTag(Tag a);
	
=======
	public Tag getTag(Long id);
	public List<Tag> getAll();
>>>>>>> c9f79193f2d0f39a1e6dfdf2d5b52aaf69404fe2
}
