package com.example.demo.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> c9f79193f2d0f39a1e6dfdf2d5b52aaf69404fe2
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tag;
import com.example.demo.service.TagService;

@RestController
public class TagController {
<<<<<<< HEAD
    @Autowired
    TagService tagService;
    @RequestMapping(value = "/inserttag",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean insertTag(@RequestParam("nama_tag") String nama_tag){
        Tag tag= new Tag();
        tag.setNamaTag(nama_tag);
        tagService.SaveOrUpdate(tag);
        return true;
    }
    @RequestMapping(value = "/updatetag",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean updateTag(@RequestParam("id")long id,@RequestParam("nama_tag") String nama_tag){
        Tag tag= tagService.getById(id);
        tag.setId(id);
        tag.setNamaTag(nama_tag);
        tagService.SaveOrUpdate(tag);
        return true;
    }
   
=======

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
>>>>>>> c9f79193f2d0f39a1e6dfdf2d5b52aaf69404fe2
}
