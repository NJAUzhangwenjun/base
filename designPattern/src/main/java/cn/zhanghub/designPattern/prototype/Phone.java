package cn.zhanghub.designPattern.prototype;

import lombok.Builder;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * 类描述：
 *
 * @ClassName Phone
 * @Author 张文军
 * @Date 2021/5/17 1:40
 * @Version 1.0
 */

@Builder
public class Phone implements Cloneable {
    private static Logger log = getLogger(Phone.class);
    private String name;

    @Override
    protected Phone clone(){
        Phone phone = null;
        try {
            phone = (Phone) super.clone();
        } catch (CloneNotSupportedException e) {
            log.error("cn.zhanghub.designPattern.prototype.Phone.clone() is error :",e);
        }
        return phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                '}';
    }
}
