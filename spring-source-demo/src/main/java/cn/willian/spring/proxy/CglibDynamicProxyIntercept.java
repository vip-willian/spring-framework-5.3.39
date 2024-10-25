package cn.willian.spring.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 13:08:40
 */
public class CglibDynamicProxyIntercept implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("cglib动态代理方法执行前增强");
		Object result = methodProxy.invokeSuper(obj, args);
		System.out.println("cglib动态代理方法执行前增强");
		return result;
	}
}
