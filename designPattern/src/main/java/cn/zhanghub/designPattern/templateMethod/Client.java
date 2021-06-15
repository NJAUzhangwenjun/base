package cn.zhanghub.designPattern.templateMethod;

import org.junit.Test;

/**
 * 类描述：
 *
 * @ClassName Client
 * @Author 张文军
 * @Date 2021/5/23 19:06
 * @Version 1.0
 */

public class Client {
    private AbstractCook abstractCook;

    @Test
    public void cookTest() {
        abstractCook = new CookImpl();
        abstractCook.cook();
    }
}
