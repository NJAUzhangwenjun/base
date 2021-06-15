package cn.zhanghub.designPattern.command.cmd2;

import cn.zhanghub.designPattern.command.cmd2.command.Command;

/**
 * 类描述：
 *
 * @ClassName Invoker
 * @Author 张文军
 * @Date 2021/6/15 0:30
 * @Version 1.0
 */

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
