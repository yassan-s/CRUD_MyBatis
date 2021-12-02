INSERT INTO household_expenses(
     id
  , user_id
  , recode_date
  , category_id
  , money
  , income_cost_flg
  , note
)
VALUES
  (1, 1, '2021-11-20', 1, 10000, 1, '収入1'),
  (2, 1, '2021-11-20', 1, 20000, 1, '収入2'),
  (3, 1, '2021-11-20', 2, 30000, 0, 'テスト投稿2'),
  (4, 1, '2021-11-20', 3, 40000, 0, 'テスト投稿2');

INSERT INTO categories(
    id
  , category_name
 )
VALUES
  (1, '収入'),
  (2, '生活費'),
  (3, '食費'),
  (4, '貯金');
