package cn.zhanghub.designPattern.bridge.brush;

/**
 * 类描述：
 * 图形抽象类
 *
 * @ClassName Shape
 * @Author 张文军
 * @Date 2021/5/21 17:08
 * @Version 1.0
 */

public interface BrushImpl {
    /**
     * 画图型
     * @param line 线条
     */
    void draw(Double ... line);
}
