package com.arijit.MvcProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//import com.arijit.MvcProject.repository.RegistrationRepo;
//import com.arijit.MvcProject.service.Imp;

//@SuppressWarnings("deprecation")
@Configuration
@ComponentScan(basePackages="com.arijit.MvcProject")
@EnableWebMvc
//@EnableJpaRepositories
@EnableJpaRepositories(basePackages = "com.arijit.MvcProject",
								entityManagerFactoryRef = "entityManagerFactoryBean",
									transactionManagerRef = "platformtransactionManager")
public class MvcConfiguration extends WebMvcConfigurerAdapter{
	
	
	
//	(basePackages = "com.arijit.MvcProject"); 
//	entityManagerFactoryRef = "entityManagerFactoryBean",
//	transactionManagerRef = "platformtransactionManager")
	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;	
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	
	
}
