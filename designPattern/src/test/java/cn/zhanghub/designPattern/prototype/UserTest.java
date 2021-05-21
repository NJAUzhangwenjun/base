package cn.zhanghub.designPattern.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 类描述：
 *
 * @ClassName UserTest
 * @Author 张文军
 * @Date 2021/5/17 1:03
 * @Version 1.0
 */

public class UserTest {

    @Test
    public void testClone() {
        User user = User.builder()
                .password("123")
                .username("张文军")
                .phone(Phone.builder().name("小米").build())
                .build();
        User o = user.clone();
        User o1 = user.clone();
        System.out.println("---------------");
        System.out.println("o = " + o);
        System.out.println("o1 = " + o1);
        System.out.println("---------------");
        System.out.println(o.equals(o1));
        System.out.println(o.equals(user));
        System.out.println("---------------");
        System.out.println(o.getPhone().equals(o1.getPhone()));
    }
}
