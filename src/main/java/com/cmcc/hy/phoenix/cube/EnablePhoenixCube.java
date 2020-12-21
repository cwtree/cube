package com.cmcc.hy.phoenix.cube;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 
 * @author phoenix
 * @date 2020-12-19
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Import()
@Documented
public @interface EnablePhoenixCube {

}
