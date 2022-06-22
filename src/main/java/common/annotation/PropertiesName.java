package common.annotation;

import java.lang.annotation.*;

/**
 * <p>Description: 自定义接口</p>
 * <p>Date: 2021/6/2 10:55 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PropertiesName {
    public String name();
}
