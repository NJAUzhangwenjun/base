package cn.zhanghub.designPattern.command.cmd2.receiver;

/**
 * 类描述：
 *
 * @ClassName Receiver
 * @Author 张文军
 * @Date 2021/6/15 0:27
 * @Version 1.0
 */

public class Receiver {
    /*接收者接收到命令并执行命令*/
    public void action(){
        System.out.println("command received!");
    }
}
