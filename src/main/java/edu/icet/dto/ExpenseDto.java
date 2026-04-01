package edu.icet.dto;

import lombok.*;
import org.hibernate.boot.internal.Abstract;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseDto {
    private Long id;
    private String date;
    private double costGbp;
    private String description;
    private String expenseType;
}
