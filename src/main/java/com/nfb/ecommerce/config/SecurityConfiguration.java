package com.nfb.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Configure for SPA architecture - validate JWT tokens
        http.authorizeRequests(authorize -> authorize
                .antMatchers("/", "/health", "/api/products/**", "/api/product-category/**", "/api/countries/**", "/api/states/**").permitAll()
                .antMatchers("/api/orders/**").authenticated()
                .anyRequest().authenticated()
        )
        .oauth2ResourceServer(oauth2 -> oauth2.jwt());

        // Enable CORS for Angular frontend
        http.cors();

        // Disable CSRF for stateless JWT authentication
        http.csrf().disable();
    }
}
