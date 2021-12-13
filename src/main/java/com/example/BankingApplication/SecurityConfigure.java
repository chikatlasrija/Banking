package com.example.BankingApplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		.antMatchers("/balance").authenticated()
		.antMatchers("/home").permitAll()
		.antMatchers("/about").permitAll()
		.and().formLogin()
		.and().httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		auth.inMemoryAuthentication()
		.withUser("srija").password("srija").authorities("Admin").and()
		.withUser("lavanya").password("lavanya").authorities("user").and()
		.withUser("kruthima").password("kruthima").authorities("user").and()
		.withUser("rachana").password("rachana").authorities("user").and()
		.withUser("divya").password("divya").authorities("user").and()
		.withUser("srivalli").password("srivalli").authorities("user").and().passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
   
}
