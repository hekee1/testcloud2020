package com.atguigu.springcloud;

import com.atguigu.springcloud.dao.PaymentDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(PaymentMain8001.class,args);
        String[] names = run.getBeanDefinitionNames();
        PaymentDao paymentDao =  run.getBean(PaymentDao.class);
        System.out.println(paymentDao);

    }
}