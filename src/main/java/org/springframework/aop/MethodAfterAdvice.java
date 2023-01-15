package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author xiaoso
 * @date 2023/1/15
 */
public interface MethodAfterAdvice extends AfterAdvice {

	void after(Method method, Object[] args, Object target) throws Throwable;
}
