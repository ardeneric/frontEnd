package com.notewitch.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableOAuth2Sso
@Configuration
public class OauthConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/**")
			.authorizeRequests()
			.antMatchers("/login**","/static/**")
			.permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.logout()
            .logoutSuccessUrl("https://notewitch-auth-server.herokuapp.com/auth/exit");;
			
	}
	
}
