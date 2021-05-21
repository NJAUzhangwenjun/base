package cn.zhanghub.designPattern.prototype;

import lombok.Builder;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * 类描述：
 *
 * @ClassName User
 * @Author 张文军
 * @Date 2021/5/17 0:09
 * @Version 1.0
 */

@Builder
public class User implements Cloneable{
    private static Logger log = getLogger(User.class);
    private String username;
    private String password;
    private Phone phone;

    @Override
    protected User clone() {
        User user = null;
        try {
            user = (User) super.clone();
            user.phone = this.phone.clone();
        } catch (CloneNotSupportedException e) {
            log.error("clone fail exception is : ",e);
        }
        return user;
    }

    public Phone getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                '}';
    }
}
