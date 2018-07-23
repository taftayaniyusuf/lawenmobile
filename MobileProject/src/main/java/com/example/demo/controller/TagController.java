package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tag;
import com.example.demo.service.TagService;

@RestController
public class TagController {
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
   
}
