package site.twiehaus.tazbbudget.dao.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

    Long id;
    BigDecimal amount;
    LocalDateTime date;
    String description;
    TransactionCategory transactionCategory;
    MonthlyBudget monthlyBudget;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false, precision = 19, scale = 4)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(nullable = false)
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Column(length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_category_id")
    public TransactionCategory getTransactionCategory() {
        return transactionCategory;
    }

    public void setTransactionCategory(TransactionCategory transactionCategory) {
        this.transactionCategory = transactionCategory;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "monthly_budget_id")
    public MonthlyBudget getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(MonthlyBudget monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }
}
