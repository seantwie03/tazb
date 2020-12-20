package site.twiehaus.tazbbudget.dao.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "monthly_category_plans")
public class MonthlyCategoryPlan {

    Long id;
    MonthlyBudget monthlyBudget;
    TransactionCategory transactionCategory;
    BigDecimal plannedAmount = new BigDecimal("0.00");

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "monthly_budget_id")
    public MonthlyBudget getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(MonthlyBudget monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "transaction_category_id")
    public TransactionCategory getTransactionCategory() {
        return transactionCategory;
    }

    public void setTransactionCategory(TransactionCategory transactionCategory) {
        this.transactionCategory = transactionCategory;
    }

    @Column(precision = 19, scale = 4)
    public BigDecimal getPlannedAmount() {
        return plannedAmount;
    }

    public void setPlannedAmount(BigDecimal plannedAmount) {
        this.plannedAmount = plannedAmount;
    }
}
