package com.arijit.MvcProject.database;



	import javax.sql.DataSource;
	import java.util.Properties;

	import org.springframework.context.annotation.Configuration;
	import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
	import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
	import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
	import org.springframework.jdbc.datasource.DriverManagerDataSource;
	import org.springframework.context.annotation.Bean;
	import org.springframework.orm.jpa.JpaTransactionManager;
	import org.springframework.orm.jpa.JpaVendorAdapter;
	import org.springframework.transaction.PlatformTransactionManager;
	import org.springframework.transaction.annotation.EnableTransactionManagement;

	@Configuration
	@EnableTransactionManagement
	public class Database {

		@Bean
		public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
			LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = 
						new LocalContainerEntityManagerFactoryBean();
			localContainerEntityManagerFactoryBean.setDataSource(getDataSource());
			localContainerEntityManagerFactoryBean.setPackagesToScan(new String[] {"com.arijit.MvcProject.entity","com.arijit.MvcProject.model","com.arijit.MvcProject.repository"});
			
			JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
			localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
			localContainerEntityManagerFactoryBean.setJpaProperties(getProperties());
			return localContainerEntityManagerFactoryBean;
		}
		
		public DataSource getDataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/new_schema");
			dataSource.setUsername("root");
			dataSource.setPassword("Arijit");
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			return dataSource;
		}
		
		public Properties getProperties() {
			Properties properties = new Properties();
			properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
			properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
			properties.setProperty("jdbcTemplate", "org.springframework.jdbc.core.JdbcTemplate");
//			properties.store("com.mysql.cj.jdbc.Driver","jdbc:mysql://127.0.0.1:3306/new_schema");
			return properties;
		}
		
		@Bean
		public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
		    return new PersistenceExceptionTranslationPostProcessor();
		}

		
		@Bean
		public PlatformTransactionManager platformtransactionManager() {
			JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
			jpaTransactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
			return jpaTransactionManager;
		}
	}
		
	   
		
	
	