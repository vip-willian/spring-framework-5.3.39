package cn.willian.spring.config;

import cn.willian.spring.bean.UserService1;
import cn.willian.spring.imports.UserService2ImportBeanDefinitionRegistrar;
import cn.willian.spring.imports.UserService3ImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 13:54:31
 */
// 直接导入
// 实现了ImportBeanDefinitionRegistrar接口
// 实现了ImportSelector接口
@Configuration
@Import({UserService1.class, UserService2ImportBeanDefinitionRegistrar.class, UserService3ImportSelector.class})
public class ImportConfig {
}
