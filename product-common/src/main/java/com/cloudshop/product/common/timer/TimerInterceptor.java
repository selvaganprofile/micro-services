package com.cloudshop.product.common.timer;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class TimerInterceptor implements MethodInterceptor {

	private static Logger log;

	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start = System.currentTimeMillis();

		try {
			return invocation.proceed();
		} finally {
			long finish = System.currentTimeMillis();
			log = LogManager.getLogger(invocation.getMethod().getDeclaringClass());
			log.info(String.format("[TIMER] Method %s ran in %s ms.", invocation.getMethod().getDeclaringClass()
					.getName()
					+ "." + invocation.getMethod().getName(), finish - start));
		}
	
	}

	/**
	 * Intercepts the method invocation to take the time taken to perform an
	 * action
	 */

	
		
}