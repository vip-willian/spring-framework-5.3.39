package cn.willian.spring;

import cn.willian.spring.bean.AopService;
import cn.willian.spring.bean.UserBean;
import cn.willian.spring.bean.UserService1;
import cn.willian.spring.bean.UserService2;
import cn.willian.spring.bean.UserService3;
import cn.willian.spring.config.BaseScanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-24 11:04:01
 */
public class AnnotationSpringMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BaseScanConfig.class);

		// ioc验证
		UserBean user = context.getBean(UserBean.class);
		System.out.println(user.getName());

		// aop验证
		AopService aopService = (AopService) context.getBean("aopService");
		aopService.hello();

		// import验证
		// 方式一
		UserService1 userService1 = context.getBean(UserService1.class);
		UserBean user1 = userService1.getUser();
		System.out.println(user1.getName());
		// 方式二
		UserService2 userService2 = context.getBean(UserService2.class);
		UserBean user2 = userService2.getUser();
		System.out.println(user2.getName());
		// 方式三
		UserService3 userService3 = context.getBean(UserService3.class);
		UserBean user3 = userService3.getUser();
		System.out.println(user3.getName());
	}
}
