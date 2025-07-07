package org.example.baimaspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfiguration {

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeHttpRequests(auth -> {
//                    auth.anyRequest().authenticated();
//                })
//                .formLogin(conf -> {
//                    conf.loginPage("/login");
//                    conf.loginProcessingUrl("/doLogin");
//                    conf.defaultSuccessUrl("/");
//                    conf.permitAll();
//                }).build();
//    }


}
