package org.springframework.aop.framework.adapter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodAfterAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author xiaoso
 * @date 2023/1/15
 */
public class MethodAfterAdviceInterceptor implements MethodInterceptor {

	private MethodAfterAdvice advice;

	public MethodAfterAdviceInterceptor(MethodAfterAdvice advice) {
		this.advice = advice;
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result = invocation.proceed();
		//在执行被代理方法之后，先执行after advice操作
		this.advice.after(invocation.getMethod(), invocation.getArguments(), invocation.getThis());
		return result;
	}
}
