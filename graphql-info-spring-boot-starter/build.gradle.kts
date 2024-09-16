plugins {
    java
    `maven-publish`
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


// to match the applications java version
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}


dependencies {
    compileOnly("org.springframework.boot:spring-boot-starter-parent:3.3.1")
    compileOnly("org.springframework.boot:spring-boot-starter-graphql:3.3.1")

    annotationProcessor("org.springframework.boot:spring-boot-autoconfigure-processor:3.3.1")
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.example"
            artifactId = "graphql-info-spring-boot-starter"
            version = "1.0-SNAPSHOT"

            from(components["java"])
        }
    }
}