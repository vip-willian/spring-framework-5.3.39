package cn.willian.spring.config;

import cn.willian.spring.bean.AopService;
import cn.willian.spring.bean.impl.AopServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 08:30:04
 */
@Configuration
@EnableAspectJAutoProxy
public class AopBeanConfig {

	@Bean
	public AopService aopService() {
		return new AopServiceImpl();
	}
}
