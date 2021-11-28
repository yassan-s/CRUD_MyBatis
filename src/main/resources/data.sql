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
  (1, 1, '2021-11-20', 1, 10000, 1, 'テスト投稿1'),
  (2, 1, '2021-11-20', 2, 20000, 0, 'テスト投稿2');

INSERT INTO categories(
    id
  , category_name
 )
VALUES
  (1, '収入'),
  (2, '生活費'),
  (3, '食費'),
  (4, '貯金');
