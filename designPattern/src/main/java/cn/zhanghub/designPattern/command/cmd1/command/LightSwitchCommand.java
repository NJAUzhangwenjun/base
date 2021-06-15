package cn.zhanghub.designPattern.command.cmd1.command;

/**
 * 类描述：灯的开关命令
 *
 * @ClassName LightSwitchCommand
 * @Author 张文军
 * @Date 2021/6/14 21:24
 * @Version 1.0
 */

public interface LightSwitchCommand {
    /**
     * 开灯
     */
    void open();

    /**
     * 关灯
     */
    void close();
}
