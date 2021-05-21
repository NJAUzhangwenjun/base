package cn.zhanghub.designPattern.adapter.classAdapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 类描述：
 *
 * @ClassName Power220Vto5VTest
 * @Author 张文军
 * @Date 2021/5/19 16:54
 * @Version 1.0
 */

public class Power220Vto5VTest {

    @Test
    public void p5V() {
        Power220Vto5V v = new Power220Vto5V(new Power220V());
        v.p5V();
    }
}
