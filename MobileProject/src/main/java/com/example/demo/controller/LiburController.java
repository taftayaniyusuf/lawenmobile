package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Libur;
import com.example.demo.service.LiburService;

import de.odysseus.el.tree.impl.Parser.ParseException;
@RestController
public class LiburController {
	
	 @Autowired
	 LiburService liburService;
	//============================================= CRUD LIBUR ==================================================
	 
		 //Select All Libur
		 @RequestMapping(value = "/libur")
		 public List<Libur> liburList(){
		     return liburService.getAllLibur();
		 }
		 
		 //Insert Libur
		@RequestMapping(value = "/insertlibur/",method = RequestMethod.POST,headers="Accept=application/json")
		public boolean insertLibur(@RequestParam(value = "nama_libur",required = false) String nama_libur,
			                                      @RequestParam (value = "tanggal", required = false)  @DateTimeFormat(pattern="yyyy-MM-dd") Date tanggal,
			                                     @RequestParam(value = "deskripsi_libur", required = false) String deskripsi_libur
			                                    
		){
			Libur libur = new Libur();

			libur.setNama_libur(nama_libur);
			libur.setTanggal(tanggal);
			libur.setDeskripsi_libur(deskripsi_libur);
			liburService.SaveOrUpdate(libur);
			return true;
		}
		
		 //Update Libur
		 @RequestMapping(value = "/updatelibur/",method = RequestMethod.POST,headers="Accept=application/json")
		    public boolean updatePengingat(@RequestParam(value = "id",required = false)  Long id,
								    		@RequestParam(value = "nama_libur",required = false) String nama_libur,
							                @RequestParam (value = "tanggal", required = false) @DateTimeFormat(pattern="yyyy-MM-dd")  Date tanggal,
							               @RequestParam(value = "deskripsi_libur", required = false) String deskripsi_libur
		    )throws ParseException {
			 	Libur libur = liburService.getById(id);
			 	
			 	libur.setNama_libur(nama_libur);
				libur.setTanggal(tanggal);
				libur.setDeskripsi_libur(deskripsi_libur);
				liburService.SaveOrUpdate(libur);
		        return true;
		    }
		 
		//Delete Libur
		@RequestMapping(value = "/deletelibur/",method = RequestMethod.POST,headers="Accept=application/json")
		public boolean deleteLibur(@RequestParam(value = "id",required = false)  Long id)throws ParseException {
			Libur libur = liburService.getById(id);

			liburService.deleteLibur(id);
			return true;
		}
}
