package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
=======

>>>>>>> c9f79193f2d0f39a1e6dfdf2d5b52aaf69404fe2
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
	public List<Tag> getAllTag() {
		List<Tag> lt =new ArrayList<>();
		tr.findAll().forEach(lt::add);
		return lt;
	}

	@Override
<<<<<<< HEAD
	public Tag getById(long id) {
		// TODO Auto-generated method stub
		return tr.findById(id).get();
=======
	public Tag getTag(Long id) {
		return tr.getById(id);
	}

	@Override
	public List<Tag> getAll() {
		List<Tag> lt = new ArrayList<>();
		tr.findAll().forEach(lt::add);
		return lt;
>>>>>>> c9f79193f2d0f39a1e6dfdf2d5b52aaf69404fe2
	}
	
	public Tag saveTag(Tag t) {
		return tr.save(t);
	}
	
	public void deleteTag(Tag t) {
		tr.delete(t);
	}

	

	@Override
	public void SaveOrUpdate(Tag a) {
		// TODO Auto-generated method stub
		tr.save(a);
	}

	@Override
	public void deleteTag(long id) {
		// TODO Auto-generated method stub
		tr.deleteById(id);
	}

	@Override
	public void deleteTag(Tag a) {
		// TODO Auto-generated method stub
		tr.delete(a);
	}

}
