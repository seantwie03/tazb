package site.twiehaus.tazbbudget.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import site.twiehaus.tazbbudget.dao.entities.TransactionCategory;

public interface TransactionCategoryRepository extends JpaRepository<TransactionCategory, Long> {
}
