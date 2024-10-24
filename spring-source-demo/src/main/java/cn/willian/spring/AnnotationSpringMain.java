package cn.willian.spring;

import cn.willian.spring.bean.UserBean;
import cn.willian.spring.config.BaseScanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-24 11:04:01
 */
public class AnnotationSpringMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BaseScanConfig.class);
		UserBean user = context.getBean(UserBean.class);
		System.out.println(user.getName());
	}
}
