package com.spring.student.congfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class StudentSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		auth.inMemoryAuthentication().withUser("Admin").password("Admin").roles("ADMIN");
	}
	
	//security for all API
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception{
	 * 
	 * http.csrf().disable();
	 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	 * }
	 */
	
	//security based on URL
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/getAll").fullyAuthenticated().and().httpBasic();
	}
	
	
	//security based on role
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception{
	 * 
	 * http.csrf().disable();
	 * http.authorizeRequests().antMatchers("/getAll").hasAnyRole("ADMIN").
	 * anyRequest().fullyAuthenticated().and().httpBasic(); }
	 */
	
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance(); 
	}
	
}
