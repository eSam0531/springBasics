package com.esmee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class EsmeeConfig extends WebSecurityConfigurerAdapter{

	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("hcl").password("{noop}123").authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password("{noop}123").authorities("USER");
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/default").permitAll()
		.antMatchers("/welcome").authenticated()
		.antMatchers("/user").hasAuthority("USER")
		.antMatchers("/admin").hasAuthority("ADMIN")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("/welcome",true)
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.and()
		.exceptionHandling()
		.accessDeniedPage("/accessDenied");
	}
	
	
	
	//Deprecated method
//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
}
