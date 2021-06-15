package cn.zhanghub.designPattern.command.cmd1.test;

import cn.zhanghub.designPattern.command.cmd1.command.LightSwitchCommand;
import cn.zhanghub.designPattern.command.cmd1.command.concreteCommand.ConcreteLightSwitchCommand;
import cn.zhanghub.designPattern.command.cmd1.light.ALight;

/**
 * 类描述：
 *
 * @ClassName Client
 * @Author 张文军
 * @Date 2021/6/14 21:39
 * @Version 1.0
 */

public class Invoker {
    private LightSwitchCommand command;

    public Invoker(LightSwitchCommand command) {
        this.command = command;
    }


    public static void main(String[] args) {
        LightSwitchCommand command = new ConcreteLightSwitchCommand(new ALight());
        Invoker invoker = new Invoker(command);
        invoker.command.open();
        invoker.command.open();
    }
}
