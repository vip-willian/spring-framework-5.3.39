package cn.willian.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-24 11:04:30
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan("cn.willian.spring")
public class BaseScanConfig {

}
