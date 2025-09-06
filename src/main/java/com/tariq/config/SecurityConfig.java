package com.tariq.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity http) throws Exception {
        return http.csrf(ServerHttpSecurity.CsrfSpec::disable).
                authorizeExchange(auth ->
                        auth.pathMatchers("/BlogBE/v3/api-docs/**", "/swagger-ui/**", "/v3/api-docs/**", "/webjars/swagger-ui/index.html").
                                permitAll().anyExchange().authenticated()).formLogin(ServerHttpSecurity.FormLoginSpec::disable).httpBasic(ServerHttpSecurity.HttpBasicSpec::disable).build();

    }
}
