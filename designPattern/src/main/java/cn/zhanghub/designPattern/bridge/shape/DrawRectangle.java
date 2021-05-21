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

public class DrawRectangle extends AbstractBrush {
    public DrawRectangle(BrushImpl brush) {
        super(brush);
    }

    public void rectangle(Double height, Double length) {
        super.draw(height, length);
        System.out.println("DrawRectangle.rectangle");
    }
}
