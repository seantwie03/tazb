package site.twiehaus.tazbbudget.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import site.twiehaus.tazbbudget.dao.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
