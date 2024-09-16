package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "info.app")
public class GraphQLStarterProperties {
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
