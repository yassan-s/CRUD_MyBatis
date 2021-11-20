CREATE TABLE household_expenses
(
   id INT NOT NULL AUTO_INCREMENT,
   user_id int NOT NULL,
   recode_date datetime NOT NULL,
   category_id int(2) NOT NULL,
   money int NOT NULL,
   income_cost_flg int NOT NULL,
   note text,
   PRIMARY KEY(id)
);