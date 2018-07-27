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

	@Query(value = "SELECT ea FROM expense_approval ea WHERE ea.idExpense=:idExpense AND ea.status='Active'", nativeQuery= true)
	List<ExpenseApproval> findByExpense(@Param("idExpense") ExpenseKategori ek);
	@Query(value = "SELECT ea FROM expense_approval ea"
					+ " WHERE ea.idExpense=:idExpense"
					+ "AND ea.idApproval=:idApproval"
					+ " AND ea.status='Active'", nativeQuery= true)
	ExpenseApproval getByExpenseAndApproval(@Param("idExpense") Long ek, @Param("idApproval") Long a);

}
