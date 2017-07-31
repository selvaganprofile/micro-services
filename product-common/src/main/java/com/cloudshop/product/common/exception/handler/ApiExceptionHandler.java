package com.cloudshop.product.common.exception.handler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This interface allows to add an annotation to every class which need to work
 * with our own exceptions
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ApiExceptionHandler {

}
