package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.service.*;

import de.odysseus.el.tree.impl.Parser.ParseException;

@RestController
public class CheckinController {
	@Autowired
	MasukService masukService;
	 
	 //Insert Masuk
	@RequestMapping(value = "/insertmasuk/",method = RequestMethod.POST,headers="Accept=application/json")
	public boolean insertMasuk(          @RequestParam (value = "lattitude_masuk", required = false) Float lattitude_masuk,
	                                     @RequestParam(value = "longitude_masuk", required = false) Float longitude_masuk,
	                                     @RequestParam(value = "status", required = false) Boolean status){
		 Masuk masuk = new Masuk();
		 masuk.setJam_masuk(new Date());
		 masuk.setLattitude_masuk(lattitude_masuk);
		 masuk.setLongitude_masuk(longitude_masuk);
		 masuk.setStatus_fraud(status);
		 masuk.setCreateDate(new Date());
		 masukService.SaveOrUpdate(masuk);
	     return true;
	}
	 //Update Masuk
	@RequestMapping(value = "/updatemasuk/",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean updatePengingat(@RequestParam(value = "id",required = false)  Long id,
								                @RequestParam (value = "lattitude_masuk", required = false) Float lattitude_masuk,
								               @RequestParam(value = "longitude_masuk", required = false) Float longitude_masuk,
								               @RequestParam(value = "status", required = false) Boolean status
	    )throws ParseException {
		Masuk masuk = masukService.getById(id);
	 	masuk.setJam_masuk(new Date());
		masuk.setLattitude_masuk(lattitude_masuk);
	 	masuk.setLongitude_masuk(longitude_masuk);
	 	masuk.setStatus_fraud(status);
	 	masuk.setUpdateDate(new Date());
	 	masukService.SaveOrUpdate(masuk);
	 	return true;
	 }
	 
	 //Delete Masuk
	 @RequestMapping(value = "/deletemasuk/",method = RequestMethod.POST,headers="Accept=application/json")
	 public boolean deleteMasuk(@RequestParam(value = "id",required = false)  Long id)throws ParseException {
		Masuk masuk = masukService.getById(id);
		masukService.deleteMasuk(masuk);
		return true;
	 }
	 @RequestMapping(value = "/disablemasuk/",method = RequestMethod.POST,headers="Accept=application/json")
	 public boolean disableMasuk(@RequestParam(value = "id",required = false)  Long id)throws ParseException {
		Masuk masuk = masukService.getById(id);
		masuk.setStatus("disable");
		masukService.SaveOrUpdate(masuk);
		return true;
	 }	    
	 
//================================================================GET===================================
		@RequestMapping(value = "/masukall",method = RequestMethod.GET)
		public List<Masuk> masukList(){
			return masukService.getAllMasuk();
		}
		
	 @RequestMapping(value = "/masukbyid",method = RequestMethod.GET)
	 public Masuk masukbyid(@RequestParam("id")long id){
	 return masukService.getById(id);
	 }
	 
	 @RequestMapping(value = "/masukaktif",method = RequestMethod.GET)
	 public List<Masuk> getMasukActive(){
	 return masukService.getMasukActive();
	 }
}
