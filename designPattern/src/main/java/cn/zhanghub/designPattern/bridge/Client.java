package cn.zhanghub.designPattern.bridge;

import cn.zhanghub.designPattern.bridge.brush.BlueBrushImplImpl;
import cn.zhanghub.designPattern.bridge.brush.RedBrushImplImpl;
import cn.zhanghub.designPattern.bridge.shape.DrawCircle;
import org.junit.Test;

/**
 * 类描述：
 *
 * @ClassName Client
 * @Author 张文军
 * @Date 2021/5/21 17:53
 * @Version 1.0
 */

public class Client {
    @Test
    public void bridgeTest() {
        DrawCircle circle = new DrawCircle(new RedBrushImplImpl());
        circle.circle(1.0);

        DrawCircle circle1 = new DrawCircle(new BlueBrushImplImpl());
        circle1.circle(1.0);


       /* DrawRectangle rectangle = new DrawRectangle(new BlueBrushImplImpl());
        rectangle.rectangle(123.0, 89.0);*/
    }
}
