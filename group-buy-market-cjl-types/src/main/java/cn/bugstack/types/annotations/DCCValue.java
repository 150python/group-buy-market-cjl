package cn.bugstack.types.annotations;

import java.lang.annotation.*;

/**
 * @author Administrator
 * @description
 * @create 2026/11/3 14:10
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface DCCValue {
    String value() default "";

}
