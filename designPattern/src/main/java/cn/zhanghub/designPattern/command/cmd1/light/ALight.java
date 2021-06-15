package cn.zhanghub.designPattern.command.cmd1.light;

/**
 * 类描述：
 *
 * @ClassName ALight
 * @Author 张文军
 * @Date 2021/6/14 21:29
 * @Version 1.0
 */

public class ALight implements Light{


    @Override
    public void openLight() {
        System.out.println("ALight.openLight");
    }

    @Override
    public void closeLight() {
        System.out.println("ALight.closeLight");
    }
}
