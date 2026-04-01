package edu.icet.entity;

import jakarta.persistence.*;
import lombok.*;
@Table(name = "expense")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ExpenseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    @Column(nullable = false)
    private double costGbp;
    private String description;
    @Column(nullable = false)
    private String expenseType;
}
