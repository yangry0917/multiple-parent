package com.yry.multipleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

/*@ComponentScan(basePackages = {"com.tian.springbootservice","com.tian.springbootweb"})
@EnableJpaRepositories(value = {"com.tian.springbootdao.repository"})
@EntityScan(value = {"com.tian.springbootdao.entity"})*/

public class MultipleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultipleWebApplication.class, args);
    }

}
