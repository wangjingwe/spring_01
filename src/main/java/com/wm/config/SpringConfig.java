package com.wm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Wm
 * @description
 */
@Configuration
@ComponentScan("com.wm")
@EnableAspectJAutoProxy
public class SpringConfig {
}
