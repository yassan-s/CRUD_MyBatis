# CRUD for MyBatis
MyBatisを用いたCRUD処理の把握


## JDBCとの違い
### jdbcTemplate
1. String型でSQLを変数に格納する
2. SQLを実行し、List<Map<String, Object>>に格納する
3. MapのObject型の値をキャストして、それぞれentitiyにループ処理で格納
4. returnで、List<entity型>を返す
以下は例を表示、変数resultListは任意の変数名
```
List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
```
Map<String, Object>でレコード１件を取得<br>
String: カラム<br>
Object: 値<br>
これを1件ずつList<Map<String, Object>>として格納する

### MyBatis
1. Mapperを準備する
2. src/main/resources直下に、mapperのフォルダを作成<br>
   passはpackageに例を記載「com.example.demo.mapper」
3. Mapper.xmlを作成
4. xmlファイルにSQLを記載
5. Serviceにフィールドとして追記

下記に例を記載
```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

//namespace: mapperのpass
<mapper namespace="com.example.demo.mapper.SavingMapper">
  //id: mapperのメソッド
  //resultType: entitiyのクラス
	<select id="selectAll" resultType="com.example.demo.entitiy.Saving">
		SELECT *
		FROM テーブル名
	</select>
</mapper>
```


## ドキュメント
***
1. [Spring Boot リファレンスドキュメント](https://spring.pleiades.io/spring-boot/docs/current/reference/html/)
2. [Spring ドキュメント](https://spring.pleiades.io/)
3. [MyBatis](https://mybatis.org/mybatis-3/ja/index.html)
4. [Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf_ja.html#thymeleaf%E3%81%AE%E7%B4%B9%E4%BB%8B)
5. [Bootstrap5](https://getbootstrap.jp/docs/5.0/getting-started/introduction/)
***
