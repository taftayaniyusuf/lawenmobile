package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Log;
import com.example.demo.model.PengajuanDana;
import com.example.demo.service.ExpenseKategoriService;
import com.example.demo.service.LogService;
import com.example.demo.service.PengajuanDanaService;
import com.example.demo.service.RuleService;
import com.example.demo.service.StatusService;
import com.example.demo.service.TagService;

@RestController
public class PengajuanDanaController {
	
	@Autowired
	PengajuanDanaService pds;
	
	@Autowired
	LogService ls;
	
	@Autowired
	RuleService rs;
	
	@Autowired
	ExpenseKategoriService eks;
	
	@Autowired
	TagService ts;
	
	@Autowired
	StatusService ss;
	
	
	// Buat pengajuan dana sebagai draft
	@PostMapping(value="/draftpengajuan")
	public boolean draftPengajuan(@ModelAttribute("pengajuandana") PengajuanDana pd) {
		pd.setStatus_pengajuan(ss.getDraft());
		pds.savePengajuan(pd);
		return true;
	}
	
	// Buat pengajuan dana sebagai terkirim
	@PostMapping(value="/sendpengajuan")
	public boolean sendPengajuan(@ModelAttribute("pengajuandana") PengajuanDana pd, @ModelAttribute("log") Log l) {
		pd.setStatus_pengajuan(ss.getSent());
		pds.savePengajuan(pd);
		ls.saveLog(l,pd);
		return true;
	}
	
	// Mengambil semua pengajuan dana
	@GetMapping(value="/pengajuandana")
	public List<PengajuanDana> getAllPengajuan(){
		return pds.getAll();
	}
	
//	@PostMapping(value="/prosespengajuan")
//	public boolean updatePengajuan(@ModelAttribute("pengajuandana") PengajuanDana pd) {
//		pds.savePengajuan(pd);
//		return true;
//	}
	
	// Mengambil semua pengajuan reimbursement
	@GetMapping(value="/reimbursement")
	public List<PengajuanDana> getAllReimbursement(){
		return pds.getReimbursement();
	}
	
	// Mengambil semua pengajuan cash advance
	@GetMapping(value="/cashadvance")
	public List<PengajuanDana> getAllCashAdvance(){
		return pds.getCashAdvance();
	}
	
	@PostMapping(value="/drafttosendpengajuan")
	public boolean draftToSendPengajuan(@RequestParam("id") Long id, @ModelAttribute("pengajuandana") PengajuanDana pd) {
		pds.getPengajuan(id);
		return true;
	}

}
