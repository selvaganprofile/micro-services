package com.cloudshop.product.common.timer;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This interface allows to add an annotation to every class which need to take
 * the time taken to perform an action
 */
@Retention(RUNTIME)
@Target(METHOD)
@Inherited
@Documented
public @interface Timer {

}
