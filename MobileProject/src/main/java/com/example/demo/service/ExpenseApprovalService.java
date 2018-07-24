package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ExpenseApprovalDao;
import com.example.demo.model.ExpenseApproval;
import com.example.demo.repository.ExpenseApprovalRepository;

public class ExpenseApprovalService implements ExpenseApprovalDao{
	 @Autowired
	 ExpenseApprovalRepository expenseApprovalRepository;
	@Override
	public List<ExpenseApproval> getAllExpenseApproval() {
		 List<ExpenseApproval> al = new ArrayList<>();
		 expenseApprovalRepository.findAll().forEach(al::add);
	        return al;
	}
	@Override
	public void SaveOrUpdate(ExpenseApproval a) {
		expenseApprovalRepository.save(a);
		
	}
	@Override
	public void deleteExpenseApproval(long id) {
		expenseApprovalRepository.deleteById(id);
		
	}
	@Override
	public void deleteExpenseApproval(ExpenseApproval a) {
		expenseApprovalRepository.delete(a);
		
	}

}
