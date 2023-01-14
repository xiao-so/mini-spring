package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author derekyi
 * @date 2020/11/22
 */
public class BeanFactory {
	private Map<String, Object> beanMap = new HashMap<>();

	/**
	 * 注册bean
	 * @param name bean name
	 * @param bean bean 实例对象
	 */
	public void registerBean(String name, Object bean) {
		beanMap.put(name, bean);
	}

	/**
	 * 根据bean名获取bean
	 * @param name bean name
	 * @return bean实例
	 */
	public Object getBean(String name) {
		return beanMap.get(name);
	}
}
