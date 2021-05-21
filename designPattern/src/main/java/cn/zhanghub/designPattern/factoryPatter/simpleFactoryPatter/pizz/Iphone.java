package cn.zhanghub.designPattern.factoryPatter.simpleFactoryPatter.pizz;

import lombok.Data;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * 类描述：
 *
 * @ClassName Iphone
 * @Author 张文军
 * @Date 2021/5/7 2:36
 * @Version 1.0
 */

@Data
public class Iphone extends Phone{
    private static Logger log = getLogger(Iphone.class);
    @Override
    public void prepare() {
        log.info("为制作{}手机准备原材料",super.getName());
    }
}
