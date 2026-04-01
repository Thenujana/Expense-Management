package edu.icet.service.impl;

import edu.icet.dto.ExpenseDto;
import edu.icet.entity.ExpenseEntity;
import edu.icet.repository.ExpenseRepository;
import edu.icet.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {
    final ModelMapper mapper;
    final ExpenseRepository repository;
    @Override
    public void addExpense(ExpenseDto expenseDto) {
repository.save(mapper.map(expenseDto,ExpenseEntity.class));
    }

    @Override
    public List<ExpenseDto> getAll() {
        List<ExpenseDto>expenseList=new ArrayList<>();
        List<ExpenseEntity>all=repository.findAll();
        all.forEach(expenseEntity -> {
            ExpenseDto expenseDto=mapper.map(expenseEntity,ExpenseDto.class);
            expenseList.add(expenseDto);

        });
        return expenseList;
    }

    @Override
    public void deleteExpense(Long id) {
repository.deleteById(id);
    }

    @Override
    public void updateExpense(ExpenseDto expenseDto) {
repository.save(mapper.map(expenseDto,ExpenseEntity.class));
    }

    @Override
    public ExpenseDto searchById(Long id) {
        return mapper.map(repository.findById(id),ExpenseDto.class);
    }

    @Override
    public List<ExpenseDto> findByExpenseType(String expenseType) {
       List<ExpenseEntity>byType=repository.findByExpenseType(expenseType);
       ArrayList<ExpenseDto>expenseDtoArrayList=new ArrayList<>();
       byType.forEach(ExpenseEntity ->{
           expenseDtoArrayList.add(mapper.map(ExpenseEntity,ExpenseDto.class));
       });
       return expenseDtoArrayList;
    }
}
