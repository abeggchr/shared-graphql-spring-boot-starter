plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.springframework.boot:spring-boot-starter-parent:3.3.1")
    compileOnly("org.springframework.boot:spring-boot-starter-graphql:3.3.1")

    annotationProcessor("org.springframework.boot:spring-boot-autoconfigure-processor:3.3.1")
}