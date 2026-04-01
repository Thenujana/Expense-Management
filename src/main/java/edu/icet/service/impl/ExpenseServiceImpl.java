package edu.icet.service.impl;

import edu.icet.dto.ExpenseDto;
import edu.icet.service.ExpenseService;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class ExpenseServiceImpl implements ExpenseService {
    @Override
    public void addExpense(ExpenseDto expenseDto) {

    }

    @Override
    public List<ExpenseDto> getAll() {
        return List.of();
    }

    @Override
    public void deleteExpense(Long id) {

    }

    @Override
    public void updateExpense(Long id) {

    }

    @Override
    public ExpenseDto searchById(Long id) {
        return null;
    }

    @Override
    public List<ExpenseDto> searchByExpenseType(String expenseType) {
        return List.of();
    }
}
