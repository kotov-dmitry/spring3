package com.spring3.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(value = {"com"})
@PropertySource("classpath:application.yml")
@Profile("annotationConfiguration")
@EnableAspectJAutoProxy
@EnableScheduling
@EnableAsync
public class AnnotationConfiguration {
}
