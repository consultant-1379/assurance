package com.ericsson.orchestration.solutiondevelopment.assurance.apex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { JpaRepositoriesAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
//@EnableJpaRepositories("com.nbi.eric.orion.opnbi.dao")
@ComponentScan(basePackages = { "com.ericsson.orchestration.solutiondevelopment.assurance.apex" })
//@EntityScan(basePackages = "com.nbi.eric.orion.opnbi.model")
public class OpnbiApplication {

    public static void main(final String[] args) {
        SpringApplication.run(OpnbiApplication.class, args);
    }
}
