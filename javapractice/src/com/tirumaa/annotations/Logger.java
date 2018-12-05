package com.tirumaa.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,ElementType.METHOD})
@Inherited
public @interface Logger {
    String value() default "";
}
