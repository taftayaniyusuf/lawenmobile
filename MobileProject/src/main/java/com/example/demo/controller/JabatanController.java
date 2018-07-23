package com.example.demo.controller;

import com.example.demo.model.Jabatan;
import com.example.demo.service.JabatanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JabatanController {
    @Autowired
    JabatanService jabatanService;
    @RequestMapping(value = "/insertjabatan",method = RequestMethod.POST,headers = "Accept=application/json")
    public  boolean insertJabatan(@RequestParam("nama_jabatan") String nama_jabatan){
        Jabatan jabatan = new Jabatan();
        jabatan.setNama_jabatan(nama_jabatan);
        jabatanService.SaveOrUpdate(jabatan);
        return true;
    }
    @RequestMapping(value = "/updatejabatan",method = RequestMethod.POST,headers = "Accept=application/json")
    public  boolean updateJabatan(@RequestParam("id")long id,@RequestParam("nama_jabatan") String nama_jabatan){
        Jabatan jabatan = jabatanService.getById(id);
        jabatan.setId(id);
        jabatan.setNama_jabatan(nama_jabatan);
        jabatanService.SaveOrUpdate(jabatan);
        return true;
    }
    @RequestMapping(value = "/deletejabatan",method = RequestMethod.POST,headers = "Accept=application/json")
    public  boolean deleteJabatan(@RequestParam("id")long id,@RequestParam("nama_jabatan") String nama_jabatan){
        Jabatan jabatan = jabatanService.getById(id);
        jabatanService.deleteJabatan(id);
        return true;
    }
}
