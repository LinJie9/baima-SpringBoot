package org.example.baimaspringboot;

import jakarta.annotation.Resource;
import org.example.baimaspringboot.entity.Account;
import org.example.baimaspringboot.repo.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class DemoApplicationTests {

    @Resource
    AccountRepository repository;
//    JdbcTemplate template;
//    DataSource source;


    @Test
    void contextLoads() {
        Account account = new Account();
        account.setUsername("admin");
        account.setPassword("654321");
        System.out.println(repository.save(account) );


//        repository.findById(1).ifPresent(System.out::println);

//        7.30
//        SimpleJdbcInsert simple = new  SimpleJdbcInsert(source)
//                .withTableName("user")
//                .usingGeneratedKeyColumns("id");
//        Map<String, Object> user = new HashMap<>(2);
//        user.put("name", "bob");
//        user.put("email", "123123123qq.com");
//        user.put("password", "123456");
//        Number number = simple.executeAndReturnKey(user);
//        System.out.println(number);



//        template.queryForMap("select * from user where id = ?", 1);
//       User user =  template.queryForObject("select * from user where id = ?",
//                (r, i) -> new User(r.getInt(1), r.getString(2), r.getString(3), r.getString(4)), 1);
//            System.out.println(user);
//        List<Map<String,Object>> maps = template.queryForList("select * from users");
//        System.out.println(maps);
//        int update = template.update("insert into user values(2, 'admin', '654321@qq.com', '123456')");
//        System.out.println("更新了 "+update+" 行");
    }
}


