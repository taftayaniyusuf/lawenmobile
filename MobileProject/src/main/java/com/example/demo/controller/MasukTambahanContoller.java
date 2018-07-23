package com.example.demo.controller;

import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Absen;
import com.example.demo.model.MasukTambahan;
import com.example.demo.service.AbsenService;
import com.example.demo.service.DataLoginService;
import com.example.demo.service.MasukTambahanService;

import de.odysseus.el.tree.impl.Parser.ParseException;

@RestController
public class MasukTambahanContoller {
	@Autowired
	 MasukTambahanService masukTambahanService;
	
	@Autowired
	AbsenService absenService;
	
	 //Select All Masuk Tambahan
	 @RequestMapping(value = "/masuktambahan",method = RequestMethod.POST)
	 public List<MasukTambahan> masuktambahanList(){
	     return masukTambahanService.getAllMasukTambahan();
	 }
	 
	 //Insert Masuk Tambahan
	 @RequestMapping(value = "/insertmasuktambahan/",method = RequestMethod.POST,headers="Accept=application/json")
	    public boolean insertMasukTambahan(@RequestParam(value = "jam_masuk_tambahan",required = false) @DateTimeFormat(pattern="HH:mm:dd") Time jam_masuk_tambahan,
	                                      @RequestParam (value = "lattitude_masuk_tambahan", required = false) Float lattitude_masuk_tambahan,
	                                     @RequestParam(value = "longitude_masuk_tambahan", required = false) Float longitude_masuk_tambahan,
	                                     @RequestParam(value = "id_absen", required = false) Long id_absen
	                                    
	    ){
		 	MasukTambahan masukTambahan = new MasukTambahan();
		 	masukTambahan.setJam_masuk_tambahan(jam_masuk_tambahan);
		 	masukTambahan.setLatitude_masuk_tambahan(lattitude_masuk_tambahan);
		 	masukTambahan.setLongitude_masuk_tambahan(longitude_masuk_tambahan);
		 	masukTambahan.setAbsen(absenService.getById(id_absen));
		 	masukTambahanService.SaveOrUpdate(masukTambahan);
	        return true;
	    }
	 //Update Masuk Tambahan
	 @RequestMapping(value = "/updatemasuktambahan/",method = RequestMethod.POST,headers="Accept=application/json")
	    public boolean updatePengingat(@RequestParam(value = "id",required = false)  Long id,
					    				@RequestParam(value = "jam_masuk_tambahan",required = false) @DateTimeFormat(pattern="HH:mm:dd") Time jam_masuk_tambahan,
				                        @RequestParam (value = "lattitude_masuk_tambahan", required = false) Float lattitude_masuk_tambahan,
				                        @RequestParam(value = "longitude_masuk_tambahan", required = false) Float longitude_masuk_tambahan,
				                        @RequestParam(value = "id_absen", required = false) Long id_absen
	    		)throws ParseException {
		 	MasukTambahan masukTambahan = masukTambahanService.getById(id);
		 	
		 	masukTambahan.setJam_masuk_tambahan(jam_masuk_tambahan);
		 	masukTambahan.setLatitude_masuk_tambahan(lattitude_masuk_tambahan);
		 	masukTambahan.setLongitude_masuk_tambahan(longitude_masuk_tambahan);
		 	masukTambahan.setAbsen(absenService.getById(id_absen));
		 	masukTambahanService.SaveOrUpdate(masukTambahan);
		 	return true;
	    }
	 
	 //Delete Masuk Tambahan
	 @RequestMapping(value = "/deletemasuktambahan/",method = RequestMethod.POST,headers="Accept=application/json")
	    public boolean deleteMasuk(@RequestParam(value = "id",required = false)  Long id)throws ParseException {
		 MasukTambahan masukTambahan = masukTambahanService.getById(id);

		 	masukTambahanService.deleteMasukTambahan(id);
		 	 return true;
	    }
}
