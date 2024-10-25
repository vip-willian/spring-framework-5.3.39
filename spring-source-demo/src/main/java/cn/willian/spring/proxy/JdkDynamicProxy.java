package cn.willian.spring.proxy;

import cn.willian.spring.bean.AopService;

import java.lang.reflect.Proxy;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 13:02:11
 */
public class JdkDynamicProxy {

	private AopService aopService;

	public JdkDynamicProxy(AopService aopService) {
		this.aopService = aopService;
	}

	// 获取代理对象
	public Object getProxy() {
		return Proxy.newProxyInstance(aopService.getClass().getClassLoader(), aopService.getClass().getInterfaces(), (proxy, method, args) -> {
			System.out.println("jdk动态代理方法执行前增强");
			Object result = method.invoke(aopService, args);
			System.out.println("jdk动态代理方法执行后增强");
			return result;
		});
	}
}
