package cn.zhanghub.designPattern.command.cmd2.command;

import cn.zhanghub.designPattern.command.cmd2.receiver.Receiver;

/**
 * 类描述：
 *
 * @ClassName MyCommand
 * @Author 张文军
 * @Date 2021/6/15 0:28
 * @Version 1.0
 */

public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 发出命令
     */
    @Override
    public void exe() {
        receiver.action();
    }
}
