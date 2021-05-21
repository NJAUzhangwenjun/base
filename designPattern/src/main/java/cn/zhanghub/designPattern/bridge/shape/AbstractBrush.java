package cn.zhanghub.designPattern.bridge.shape;

import cn.zhanghub.designPattern.bridge.brush.BrushImpl;

/**
 * 类描述：
 *
 * @ClassName AbstractBrush
 * @Author 张文军
 * @Date 2021/5/21 17:45
 * @Version 1.0
 */

public abstract class AbstractBrush {
    private BrushImpl brush;

    public AbstractBrush(BrushImpl brush) {
        this.brush = brush;
    }
    /**
     * 画图型
     * @param line 线条
     */
    void draw(Double ... line) {
        this.brush.draw(line);
    }
}
