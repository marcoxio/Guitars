package com.pluralsight.datarest.psguitar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages={"com.pluralsight.datarest.psguitar.repository"})
public class JpaConfiguration {

}
