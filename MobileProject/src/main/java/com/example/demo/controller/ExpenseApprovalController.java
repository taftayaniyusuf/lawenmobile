package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ExpenseApproval;
import com.example.demo.service.ApprovalService;
import com.example.demo.service.ExpenseApprovalService;
import com.example.demo.service.ExpenseKategoriService;
import com.example.demo.service.KaryawanService;

@RestController
public class ExpenseApprovalController {

	@Autowired
	ExpenseApprovalService expenseApprovalService;

	@Autowired
	KaryawanService karyawanService;

	@Autowired
	ApprovalService approvalService;

	@Autowired
	ExpenseKategoriService expenseKategoriService;

	@PostMapping(value = "/insertexpenseapproval")
	public boolean insertExpenseApproval(@RequestParam("namaApproval") String namaApproval, @RequestParam("rule") String rule,
											@RequestParam("idExpense") Long idExpense,
											@RequestParam("idApproval") Long idApproval,
											@RequestParam("idKaryawan") Long idKaryawan) {
		ExpenseApproval ea = new ExpenseApproval(idExpense, idApproval);
		ea.setIdKaryawan(karyawanService.getById(idKaryawan));
		ea.setNamaApproval(namaApproval);
		ea.setRule(rule);
		expenseApprovalService.SaveOrUpdate(ea);
		return true;
	}

	@PutMapping(value = "/updateexpenseapproval")
	public boolean updateExpenseApproval(@RequestParam("namaApproval") String namaApproval, @RequestParam("rule") String rule,
											@RequestParam("idExpense") Long idExpense,
											@RequestParam("idApproval") Long idApproval,
											@RequestParam("idKaryawan") Long idKaryawan) {
		ExpenseApproval ex = expenseApprovalService.getById(idExpense,idApproval);
		ex.setIdKaryawan(karyawanService.getById(idKaryawan));
		ex.setNamaApproval(namaApproval);
		ex.setRule(rule);
		expenseApprovalService.SaveOrUpdate(ex);
		return true;
	}

	@DeleteMapping(value = "/deleteexpenseapproval")
	public boolean deleteExpenseApproval(@RequestParam("idExpense") Long idExpense,
											@RequestParam("idApproval") Long idApproval) {
		ExpenseApproval ex = expenseApprovalService.getById(idExpense, idApproval);
		expenseApprovalService.deleteExpenseApproval(ex);
		return true;
	}

}
