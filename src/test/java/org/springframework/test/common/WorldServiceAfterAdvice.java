package org.springframework.test.common;

import org.springframework.aop.MethodAfterAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author derekyi
 * @date 2020/12/6
 */
public class WorldServiceAfterAdvice implements MethodAfterAdvice {

	@Override
	public void after(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("AfterAdvice: do something after the earth explodes");
	}
}
