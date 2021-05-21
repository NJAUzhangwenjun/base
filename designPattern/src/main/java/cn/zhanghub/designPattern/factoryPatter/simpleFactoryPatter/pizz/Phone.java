package cn.zhanghub.designPattern.factoryPatter.simpleFactoryPatter.pizz;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 类描述：
 *
 * @ClassName Phone
 * @Author 张文军
 * @Date 2021/5/7 2:28
 * @Version 1.0
 */

@Data
public abstract class Phone {
    private static Logger log = LoggerFactory.getLogger(Phone.class);
    private String name;
    public abstract void prepare();
    public void encapsulation() {
        log.info("封装；{} 手机",name);
    }

    public void test() {
        log.info("测试；{} 手机",name);
    }

    public void box() {
        log.info("打包；{} 手机",name);
    }
}
