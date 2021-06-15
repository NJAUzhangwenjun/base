package cn.zhanghub.designPattern.decorator;

/**
 * 类描述：
 *
 * @ClassName SecondRobotImpl
 * @Author 张文军
 * @Date 2021/5/22 3:35
 * @Version 1.0
 */

public class SecondRobotImpl implements Robot {
    private Robot robot;

    public SecondRobotImpl(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void doSomething() {
        robot.doSomething();
    }

    public void doOtherThing() {
        System.out.println("SecondRobotImpl.doOtherThing");
    }
}
