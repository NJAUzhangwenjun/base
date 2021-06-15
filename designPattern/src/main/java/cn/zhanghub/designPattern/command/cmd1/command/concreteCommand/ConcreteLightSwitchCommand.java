package cn.zhanghub.designPattern.command.cmd1.command.concreteCommand;

import cn.zhanghub.designPattern.command.cmd1.command.LightSwitchCommand;
import cn.zhanghub.designPattern.command.cmd1.light.Light;

/**
 * 类描述：
 *
 * @ClassName ConcreteLightSwitchCommand
 * @Author 张文军
 * @Date 2021/6/14 21:28
 * @Version 1.0
 */

public class ConcreteLightSwitchCommand implements LightSwitchCommand {
    private Light light;

    public ConcreteLightSwitchCommand(Light aLight) {
        this.light = aLight;
    }

    /**
     * 开灯
     */
    @Override
    public void open() {
        light.openLight();
    }

    /**
     * 关灯
     */
    @Override
    public void close() {
        light.closeLight();
    }
}
