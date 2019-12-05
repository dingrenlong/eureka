package com;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author drl
 * @Description 新版（Spring Cloud 2.0 以上）的security默认启用了csrf检验，要在eurekaServer端配置security的csrf检验为false
 * @date 2019/12/4 0004 15:00
 * @since JDK1.8
 **/
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
