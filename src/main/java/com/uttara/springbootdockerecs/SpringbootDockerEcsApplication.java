package com.uttara.springbootdockerecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class SpringbootDockerEcsApplication {

    @GetMapping
    public String applicationStatus() {
        return "Application is up and running !";
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return "Hi " + name + " Welcome to uttara AWS ECS Example";
    }
    public static void main(String[] args) {

        SpringApplication.run(SpringbootDockerEcsApplication.class, args);
    }

}
