package site.twiehaus.tazbbudget.dao.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "transaction_categories")
public class TransactionCategory {

   Long id;
   String name;
   List<Transaction> transactions;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   @Column(length = 24, unique = true, nullable = false)
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @OneToMany(mappedBy = "transactionCategory")
   public List<Transaction> getTransactions() {
      return transactions;
   }

   public void setTransactions(List<Transaction> transactions) {
      this.transactions = transactions;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      TransactionCategory that = (TransactionCategory) o;
      return name.equals(that.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name);
   }

   @Override
   public String toString() {
      return "TransactionCategory{" + "name='" + name + '\'' + '}';
   }
}
