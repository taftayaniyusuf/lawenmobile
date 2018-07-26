package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Approval;
import com.example.demo.model.ExpenseApproval;
import com.example.demo.model.ExpenseKategori;

public interface ExpenseApprovalDao {
		public ExpenseApproval getById(ExpenseKategori idA, Approval idE);
		public List<ExpenseApproval> getExpenseApprovalByExpense(ExpenseKategori ek);
	 	public List<ExpenseApproval> getAllExpenseApproval();
	 	public void SaveOrUpdate(ExpenseApproval a);
	    public void deleteExpenseApproval(long id);
	    public void deleteExpenseApproval(ExpenseApproval a);
}
