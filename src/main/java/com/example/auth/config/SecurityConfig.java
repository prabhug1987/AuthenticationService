package com.example.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*SavedRequestAwareAuthenticationSuccessHandler authenticationSuccessHandler = new SavedRequestAwareAuthenticationSuccessHandler();
		authenticationSuccessHandler.setTargetUrlParameter("redirectTo");
		authenticationSuccessHandler.setDefaultTargetUrl("/");*/
		
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
		
		/*http.authorizeRequests().antMatchers("/assets/**").permitAll()
		                        .antMatchers("/login").permitAll()
		                        .anyRequest().authenticated()
		                        .and().formLogin().loginPage("/login")
		                        .successHandler(authenticationSuccessHandler)
		                        .and().logout().logoutUrl("/logout")
		                        .and().httpBasic();
		                        //.and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		                        //.ignoringAntMatchers("/instances");*/
		//super.configure(http);
	}
}
