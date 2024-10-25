package cn.willian.spring.proxy;

import cn.willian.spring.bean.AopService;
import cn.willian.spring.bean.impl.AopServiceImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 13:00:49
 */
public class ProxyMain {

	public static void main(String[] args) {
		staticProxy();
		System.out.println("------------");
		jdkDynamicProxy();
		System.out.println("------------");
		cglibDynamicProxy();
	}

	// cglib动态代理
	private static void cglibDynamicProxy() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(AopServiceImpl.class);
		enhancer.setCallback(new CglibDynamicProxyIntercept());
		AopService proxy = (AopService) enhancer.create();
		proxy.hello();
	}

	// JDK动态代理
	private static void jdkDynamicProxy() {
		AopService aopService = new AopServiceImpl();
		AopService proxy = (AopService) new JdkDynamicProxy(aopService).getProxy();
		proxy.hello();
	}

	// 静态代理
	private static void staticProxy() {
		AopService aopService = new AopServiceImpl();
		StaticProxy staticProxy = new StaticProxy(aopService);
		staticProxy.hello();
	}
}
