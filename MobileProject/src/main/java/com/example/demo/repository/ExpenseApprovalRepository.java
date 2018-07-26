package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Approval;
import com.example.demo.model.ExpenseApproval;
import com.example.demo.model.ExpenseKategori;

@Repository
public interface ExpenseApprovalRepository extends CrudRepository<ExpenseApproval,Long>{
	
	@Query(value = "select ea from ExpenseApproval ea where ea.idExpense=:idExpense and ea.status='Active")
	List<ExpenseApproval> findByExpense(@Param("idExpense") ExpenseKategori ek);
	@Query(value = "select ea from ExpenseApproval ea where ea.idExpense=:idExpense and ea.idApproval=:idApproval and ea.status='Active")
	ExpenseApproval getByExpenseAndApproval(@Param("idExpense") ExpenseKategori ek, @Param("idApproval") Approval a);

}
