CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS monthly_budgets (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  budget_date DATE UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS monthly_category_plans (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  monthly_budget_id BIGINT,
  transaction_category_id BIGINT,
  planned_amount NUMERIC(19,4),
  UNIQUE (monthly_budget_id, transaction_category_id)
);

CREATE TABLE IF NOT EXISTS transaction_categories (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(24) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS transactions (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  date TIMESTAMP NOT NULL,
  amount NUMERIC(19,4) NOT NULL,
  description VARCHAR(500),
  monthly_budget_id BIGINT,
  transaction_category_id BIGINT
);

ALTER TABLE IF EXISTS monthly_category_plans ADD FOREIGN KEY (monthly_budget_id) REFERENCES monthly_budgets (id);

ALTER TABLE IF EXISTS monthly_category_plans ADD FOREIGN KEY (transaction_category_id) REFERENCES transaction_categories (id);

ALTER TABLE IF EXISTS transactions ADD FOREIGN KEY (monthly_budget_id) REFERENCES monthly_budgets (id);

ALTER TABLE IF EXISTS transactions ADD FOREIGN KEY (transaction_category_id) REFERENCES transaction_categories (id);

commit;
