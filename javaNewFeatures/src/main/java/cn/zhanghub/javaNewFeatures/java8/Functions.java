package cn.zhanghub.javaNewFeatures.java8;

import java.util.Optional;
import java.util.function.Function;

/**
 * 类描述：
 *
 * @ClassName Functions
 * @Description TODO
 * @Author 张文军
 * @Date 2021/4/18 20:47
 * @Version 1.0
 */

public class Functions {
    public static void main(String[] args) {
        Function function = o -> o;
        function.andThen((o) -> {
            o = o.toString() + " andThen";
            System.out.println(o);
            return o;
        });
        function.apply(123);
    }

    public static void createOrder(String userName) {
        Optional optional = Optional.ofNullable(userName);
        optional.get();
    }
}
