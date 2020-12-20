package site.twiehaus.tazbbudget.dao.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "monthly_budgets")
public class MonthlyBudget {

    Long id;
    LocalDate budgetDate;
    List<Transaction> transactions;
    List<MonthlyCategoryPlan> monthlyCategoryPlans;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(unique = true,  nullable = false)
    public LocalDate getBudgetDate() {
        return budgetDate;
    }

    public void setBudgetDate(LocalDate yearMonth) {
        this.budgetDate = yearMonth;
    }

    @OneToMany(mappedBy = "monthlyBudget", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @OneToMany(mappedBy = "monthlyBudget", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<MonthlyCategoryPlan> getMonthlyCategoryPlans() {
        return monthlyCategoryPlans;
    }

    public void setMonthlyCategoryPlans(List<MonthlyCategoryPlan> monthlyCategoryPlans) {
        this.monthlyCategoryPlans = monthlyCategoryPlans;
    }
}
