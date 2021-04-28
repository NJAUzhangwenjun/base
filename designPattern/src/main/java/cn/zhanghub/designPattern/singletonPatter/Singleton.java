package cn.zhanghub.designPattern.singletonPatter;

/**
 * 类描述：
 *
 * @ClassName Singleton
 * @Author 张文军
 * @Date 2021/4/29 4:42
 * @Version 1.0
 */

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (this) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
