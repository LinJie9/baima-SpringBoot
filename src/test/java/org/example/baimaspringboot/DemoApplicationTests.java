package org.example.baimaspringboot;

import jakarta.annotation.Resource;
import org.example.baimaspringboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class DemoApplicationTests {

    @Resource
    JdbcTemplate template;

    @Test
    void contextLoads() {
//        template.queryForMap("select * from user where id = ?", 1);
//       User user =  template.queryForObject("select * from user where id = ?",
//                (r, i) -> new User(r.getInt(1), r.getString(2), r.getString(3), r.getString(4)), 1);
//            System.out.println(user);
//        List<Map<String,Object>> maps = template.queryForList("select * from users");
//        System.out.println(maps);
        int update = template.update("insert into user values(2, 'admin', '654321@qq.com', '123456')");
        System.out.println("更新了 "+update+" 行");
    }
}


