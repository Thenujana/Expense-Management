package edu.icet.service;

import edu.icet.dto.ExpenseDto;

import java.util.List;

public interface ExpenseService {
    void addExpense(ExpenseDto expenseDto);
    List<ExpenseDto> getAll();
    void deleteExpense(Long id);
    void updateExpense(ExpenseDto expenseDto);
    ExpenseDto searchById(Long id);
    List<ExpenseDto>findByExpenseType(String expenseType);

}
