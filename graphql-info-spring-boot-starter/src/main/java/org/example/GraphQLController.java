package org.example;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLController {

    private final GraphQLStarterProperties properties;

    public GraphQLController(GraphQLStarterProperties properties) {
        this.properties = properties;
    }

    @QueryMapping
    public String info() {
        return "version=%s".formatted(this.properties.getVersion());
    }
}