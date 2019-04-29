package com.example.demo2.dao;

import com.example.demo2.model.User;
import javafx.scene.paint.Stop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void fun(){

        User user=userMapper.selectByPrimaryKey("2");
        System.out.printf("user======"+user);

    }


}