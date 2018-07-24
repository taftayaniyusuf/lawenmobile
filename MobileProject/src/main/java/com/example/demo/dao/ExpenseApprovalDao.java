package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.ExpenseApproval;

public interface ExpenseApprovalDao {
	 	public List<ExpenseApproval> getAllExpenseApproval();
	 	 public void SaveOrUpdate(ExpenseApproval a);
	    public void deleteExpenseApproval(long id);
	    public void deleteExpenseApproval(ExpenseApproval a);
}
