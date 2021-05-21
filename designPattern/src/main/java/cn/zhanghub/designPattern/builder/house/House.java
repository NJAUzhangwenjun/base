package cn.zhanghub.designPattern.builder.house;

/**
 * 类描述：
 * 盖房子
 *
 * @ClassName House
 * @Author 张文军
 * @Date 2021/5/17 21:33
 * @Version 1.0
 */
public interface House {
    /**
     * 打基础
     */
    void buildBasic();

    /**
     * 砌墙
     */
    void buildWalls();

    /**
     * 盖屋顶
     */
    void roofed();

    /**
     * 构建
     * @return
     */
    House builder();
}
