package main.com.hiber.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("main.com.hiber.aop")
@EnableAspectJAutoProxy
public class Config {
}