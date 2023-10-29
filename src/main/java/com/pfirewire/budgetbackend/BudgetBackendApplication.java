package com.pfirewire.budgetbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.pfirewire.budgetbackend.config.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class BudgetBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgetBackendApplication.class, args);
    }

}
