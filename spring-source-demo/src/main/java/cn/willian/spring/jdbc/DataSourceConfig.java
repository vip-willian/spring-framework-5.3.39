package cn.willian.spring.jdbc;

import cn.willian.spring.jdbc.impl.GoodsServiceImpl;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 15:07:35
 */
@Configuration
// 启用事务管理
@EnableTransactionManagement
public class DataSourceConfig {

	// 数据源
	@Bean
	public DruidDataSource druidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUsername("root");
		druidDataSource.setPassword("userOfWillian");
		druidDataSource.setUrl("jdbc:mysql://localhost:3306/db_goods?characterEncoding=utf-8&useSSL=false");
		druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return druidDataSource;
	}

	// 事务管理器
	@Bean
	public DataSourceTransactionManager transactionManager(DruidDataSource druidDataSource) {
		return new DataSourceTransactionManager(druidDataSource);
	}

	@Bean
	public GoodsService goodsService(DruidDataSource druidDataSource) {

		// jdbc模板封装
		JdbcTemplate jdbcTemplate = new JdbcTemplate(druidDataSource);
		return new GoodsServiceImpl(jdbcTemplate);
	}
}
