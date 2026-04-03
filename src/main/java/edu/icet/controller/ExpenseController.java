package edu.icet.controller;

import edu.icet.dto.ExpenseDto;
import edu.icet.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/expense")
@RequiredArgsConstructor
public class ExpenseController {

    final ExpenseService service;
    @PostMapping("/add")
    public ResponseEntity<String>addExpense(@RequestBody ExpenseDto expense){
        service.addExpense(expense);
        return ResponseEntity.ok("New Expence Added!");
    }
    @GetMapping("/get-all")
    public List<ExpenseDto>getAll(){
        return service.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String>deleteExpense(@PathVariable Long id){
        service.deleteExpense(id);
        return ResponseEntity.ok("Record Deleted!");
    }
    @GetMapping("/get-by-id/{id}")
    public ExpenseDto searchById(@PathVariable Long id){
        return service.searchById(id);
    }
    @PutMapping("/update")
    public ResponseEntity<String>updateExpense(@RequestBody ExpenseDto expenseDto){
        service.updateExpense(expenseDto);
        return ResponseEntity.ok("Updated!");
    }
    @GetMapping("/get-by-type/{type}")
    public List<ExpenseDto>findByExpenseType(@PathVariable String type){
        return service.findByExpenseType(type);
    }
}
