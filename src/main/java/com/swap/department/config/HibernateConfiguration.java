package com.swap.department.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Component
@EnableTransactionManagement
public class HibernateConfiguration {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/department_microservice");
		datasource.setUsername("root");
		datasource.setPassword("Root@123");
		return datasource;
	}
	
	@Bean
	public LocalSessionFactoryBean getsessionFactoryBean() {
	LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
	sessionFactoryBean.setDataSource(getDataSource()) ;
	sessionFactoryBean.setPackagesToScan("com.swap.department");
	Properties hibernateProperties = new Properties();
	hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	hibernateProperties.put("hibernate.show_sql", "true");
	hibernateProperties.put("hibernate.hbm2ddl.auto", "create");
	sessionFactoryBean.setHibernateProperties(hibernateProperties);
	return sessionFactoryBean;
	}
	
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(getsessionFactoryBean().getObject());
		return txManager;
	}

}
