package cn.zhanghub.designPattern.command.cmd1.light;

/**
 * 类描述：
 *
 * @ClassName BLight
 * @Author 张文军
 * @Date 2021/6/14 21:37
 * @Version 1.0
 */

public class BLight implements Light {
    @Override
    public void openLight() {
        System.out.println("BLight.openLight");
    }

    @Override
    public void closeLight() {
        System.out.println("BLight.closeLight");
    }
}
