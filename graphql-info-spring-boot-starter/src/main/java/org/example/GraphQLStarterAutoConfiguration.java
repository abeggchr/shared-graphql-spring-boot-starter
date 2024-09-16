package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GraphQLStarterProperties.class)
public class GraphQLStarterAutoConfiguration {

    @Autowired
    private GraphQLStarterProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public GraphQLController graphQLController() {
        return new GraphQLController(properties);
    }
}