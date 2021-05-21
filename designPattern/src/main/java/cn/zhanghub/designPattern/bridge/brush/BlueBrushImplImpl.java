package cn.zhanghub.designPattern.bridge.brush;

import java.util.Arrays;

/**
 * 类描述：
 *
 * @ClassName RedShapeImplImpl
 * @Author 张文军
 * @Date 2021/5/21 17:41
 * @Version 1.0
 */

public class BlueBrushImplImpl implements BrushImpl {
    /**
     * 画图型
     *
     * @param line 线条
     */
    @Override
    public void draw(Double... line) {
        System.out.println("BlueBrushImplImpl.draw");
        System.out.println("蓝色画板画图:" + Arrays.toString(line));
    }
}
