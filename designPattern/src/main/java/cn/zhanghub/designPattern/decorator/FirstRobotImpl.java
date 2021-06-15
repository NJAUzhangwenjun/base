package cn.zhanghub.designPattern.decorator;

/**
 * 类描述：
 *
 * @ClassName FirstRobotImpl
 * @Author 张文军
 * @Date 2021/5/22 3:35
 * @Version 1.0
 */

public class FirstRobotImpl implements Robot {
    @Override
    public void doSomething() {
        System.out.println("FirstRobotImpl.doSomething");
    }
}
