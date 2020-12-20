package site.twiehaus.tazbbudget.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import site.twiehaus.tazbbudget.dao.entities.MonthlyCategoryPlan;

public interface MonthlyCategoryPlanRepository extends JpaRepository<MonthlyCategoryPlan, Long> {
}
