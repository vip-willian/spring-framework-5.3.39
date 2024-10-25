package cn.willian.spring.proxy;

import cn.willian.spring.bean.AopService;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 12:59:10
 */
public class StaticProxy implements AopService {
	private AopService aopService;

	public StaticProxy(AopService aopService) {
		this.aopService = aopService;
	}

	@Override
	public void hello() {
		System.out.println("静态代理方法前增强");
		aopService.hello();
		System.out.println("静态代理方法后增强");
	}
}
