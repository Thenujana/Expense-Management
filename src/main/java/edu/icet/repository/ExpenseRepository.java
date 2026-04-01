package edu.icet.repository;

import edu.icet.dto.ExpenseDto;
import edu.icet.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity,Long> {
    List<ExpenseEntity>findByExpenseType(String expenseType);
}
