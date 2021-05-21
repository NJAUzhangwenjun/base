package cn.zhanghub.designPattern.bridge.shape;

import cn.zhanghub.designPattern.bridge.brush.BrushImpl;

/**
 * 类描述：
 *
 * @ClassName DrawRectangle
 * @Author 张文军
 * @Date 2021/5/21 17:46
 * @Version 1.0
 */

public class DrawCircle extends AbstractBrush {
    public DrawCircle(BrushImpl brush) {
        super(brush);
    }

    public void circle(Double R) {
        super.draw(R);
        System.out.println("DrawCircle.circle");
    }


}
