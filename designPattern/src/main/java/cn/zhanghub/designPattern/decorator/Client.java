package cn.zhanghub.designPattern.decorator;

import org.junit.Test;

/**
 * 类描述：
 *
 * @ClassName Client
 * @Author 张文军
 * @Date 2021/5/22 3:38
 * @Version 1.0
 */

public class Client {
    private Robot robot;
    private SecondRobotImpl secondRobot;
    @Test
    public void DecoratorTest() {
        robot = new FirstRobotImpl();
        secondRobot = new SecondRobotImpl(robot);
        secondRobot.doSomething();
        secondRobot.doOtherThing();

    }
}
