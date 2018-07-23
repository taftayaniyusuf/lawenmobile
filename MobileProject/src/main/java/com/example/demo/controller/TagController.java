package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tag;
import com.example.demo.service.TagService;

@RestController
public class TagController {

	@Autowired
	TagService ts;
	
	// Menyimpan tag baru
	@PostMapping(value = "/inserttag")
	public Tag saveTag(@ModelAttribute("tag") Tag t) {
		return ts.saveTag(t);
	}
	
	// Mengambil semua tag
	@GetMapping(value = "/tag")
	public List<Tag> getAllTag(){
		return ts.getAll();
	}
	
	// Update tag
	@RequestMapping(value = "/updatetag", method = RequestMethod.POST)
	public Tag updateTag(@RequestParam("id") Long id, @RequestParam("namaTag") String namaTag) {
		Tag t = ts.getTag(id);
		t.setNamaTag(namaTag);
		ts.saveTag(t);
		return t;
	}
	
	// Hapus tag
	@DeleteMapping(value = "/hapustag")
	public boolean hapusTag(@RequestParam("id") Long id) {
		Tag t = ts.getTag(id);
		ts.deleteTag(t);
		return true;
	}
}
