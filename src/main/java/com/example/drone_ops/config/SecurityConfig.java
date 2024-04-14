package com.example.drone_ops.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .anyRequest().permitAll() // Allow access to all endpoints without authentication
                .and()
            .csrf().disable(); // Disable CSRF protection for simplicity (you may enable it in production)
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        // Allow access to static resources like CSS, JS, etc.
        web.ignoring().antMatchers("/resources/**");
    }
}
