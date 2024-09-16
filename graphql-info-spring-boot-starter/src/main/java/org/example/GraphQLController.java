package org.example;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLController {

    @QueryMapping
    public String info() {
        return "version=0.0.1";
    }
}