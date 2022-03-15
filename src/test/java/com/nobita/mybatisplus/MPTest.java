package com.nobita.mybatisplus;

import com.nobita.mybatisplus.mapper.UserMapper;
import com.nobita.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class MPTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
//        System.out.println("hello mp");
    }

}
