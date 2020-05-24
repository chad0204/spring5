package com.pc.transaction.config;


import com.pc.transaction.Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackageClasses = {Demo.class})
@Configuration
@EnableTransactionManagement//开启事务
public class Config {

	@Bean
	public DriverManagerDataSource driverManagerDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/test");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		return driverManagerDataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(driverManagerDataSource());
		jdbcTemplate.setQueryTimeout(10000);
		return jdbcTemplate;
	}


	@Bean(name="transactionManager")
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(driverManagerDataSource());
	}



}
