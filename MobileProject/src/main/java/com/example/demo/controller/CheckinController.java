package com.example.demo.controller;

import java.sql.Time;
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
	
	 //Select All Masuk
	 @RequestMapping(value = "/masuk",method = RequestMethod.POST)
	 public List<Masuk> masukList(){
	     return masukService.getAllMasuk();
	 }
	 
	 //Insert Masuk
	 @RequestMapping(value = "/insertmasuk/",method = RequestMethod.POST,headers="Accept=application/json")
	    public List<Masuk> insertMasuk(@RequestParam(value = "jam_masuk",required = false) Time jam_masuk,
	                                      @RequestParam (value = "lattitude_masuk", required = false) Float lattitude_masuk,
	                                     @RequestParam(value = "longitude_masuk", required = false) Float longitude_masuk,
	                                     @RequestParam(value = "status", required = false) Boolean status
	                                    
	    ){
		 	Masuk masuk = new Masuk();

		 	masuk.setJam_masuk(jam_masuk);
		 	masuk.setLattitude_masuk(lattitude_masuk);
		 	masuk.setLongitude_masuk(longitude_masuk);
		 	masuk.setStatus(status);
		 	masukService.SaveOrUpdate(masuk);
	        return masukService.getAllMasuk();
	    }
	 //Update Masuk
	 @RequestMapping(value = "/updatemasuk/",method = RequestMethod.POST,headers="Accept=application/json")
	    public List<Masuk> updatePengingat(@RequestParam(value = "id",required = false)  Long id,
									    		@RequestParam(value = "jam_masuk",required = false) Time jam_masuk,
								                @RequestParam (value = "lattitude_masuk", required = false) Float lattitude_masuk,
								               @RequestParam(value = "longitude_masuk", required = false) Float longitude_masuk,
								               @RequestParam(value = "status", required = false) Boolean status
	    )throws ParseException {
		 	Masuk masuk = masukService.getById(id);
		 	
		 	masuk.setJam_masuk(jam_masuk);
		 	masuk.setLattitude_masuk(lattitude_masuk);
		 	masuk.setLongitude_masuk(longitude_masuk);
		 	masuk.setStatus(status);
		 	masukService.SaveOrUpdate(masuk);
		 	return masukService.getAllMasuk();
	    }
	 
	 //Delete Masuk
	 @RequestMapping(value = "/deletemasuk/{id}",method = RequestMethod.POST,headers="Accept=application/json")
	    public List<Masuk> deleteMasuk(@RequestParam(value = "id",required = false)  Long id)throws ParseException {
		 Masuk masuk = masukService.getById(id);

		 	masukService.deleteMasuk(masuk);
		 	 return masukService.getAllMasuk();
	    }
}
