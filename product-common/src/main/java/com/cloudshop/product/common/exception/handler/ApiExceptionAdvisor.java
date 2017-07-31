package com.cloudshop.product.common.exception.handler;

import java.lang.reflect.Method;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiExceptionAdvisor extends AbstractPointcutAdvisor {

	private static final long serialVersionUID = -8213624108379541657L;

	private final StaticMethodMatcherPointcut pointcut = new StaticMethodMatcherPointcut() {
		@Override
		public boolean matches(Method method, Class<?> targetClass) {
			return method.isAnnotationPresent(ApiExceptionHandler.class);
		}
	};

	@Autowired
	private ApiExceptionInterceptor interceptor;

	@Override
	public Pointcut getPointcut() {
		return this.pointcut;
	}

	@Override
	public Advice getAdvice() {
		return this.interceptor;
	}

}
