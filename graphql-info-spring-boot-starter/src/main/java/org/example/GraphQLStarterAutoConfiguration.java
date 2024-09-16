package org.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLStarterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public GraphQLController graphQLController() {
        return new GraphQLController();
    }
}