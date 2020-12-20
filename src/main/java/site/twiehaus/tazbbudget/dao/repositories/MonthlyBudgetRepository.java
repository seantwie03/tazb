package site.twiehaus.tazbbudget.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import site.twiehaus.tazbbudget.dao.entities.MonthlyBudget;

public interface MonthlyBudgetRepository extends JpaRepository<MonthlyBudget, Long> {
}
