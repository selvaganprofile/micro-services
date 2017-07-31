package com.cloudshop.product.common.timer;

import java.lang.reflect.Method;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TimerAdvisor extends AbstractPointcutAdvisor {

	private static final long serialVersionUID = -8213624108379541657L;

	private final StaticMethodMatcherPointcut pointcut = new StaticMethodMatcherPointcut() {

		public boolean matches(Method method, Class<?> targetClass) {
			return method.isAnnotationPresent(Timer.class);	
		}	
	
	};

	@Autowired
	private TimerInterceptor interceptor;

	public Pointcut getPointcut() {
		// TODO Auto-generated method stub
		return this.pointcut;
	}

	public Advice getAdvice() {
		// TODO Auto-generated method stub
		return this.interceptor;
	}

	
	


}
