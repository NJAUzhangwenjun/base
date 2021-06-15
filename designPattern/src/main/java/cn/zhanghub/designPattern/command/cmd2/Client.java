package cn.zhanghub.designPattern.command.cmd2;

import cn.zhanghub.designPattern.command.cmd2.command.Command;
import cn.zhanghub.designPattern.command.cmd2.command.MyCommand;
import cn.zhanghub.designPattern.command.cmd2.receiver.Receiver;

/**
 * 类描述：
 *
 * @ClassName Client
 * @Author 张文军
 * @Date 2021/6/15 0:32
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
