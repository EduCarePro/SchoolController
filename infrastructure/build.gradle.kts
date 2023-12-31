plugins {
    java
    id("org.springframework.boot") version "3.1.3"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":domains"))
    implementation(project(":application"))

    implementation("org.springdoc:springdoc-openapi-ui:1.7.0")
    implementation("org.springdoc:springdoc-openapi-webmvc-core:1.7.0")

    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
    // Spring Data Neo4j
    implementation("org.springframework.boot:spring-boot-starter-data-neo4j")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-authorization-server")

    implementation("org.springframework.boot:spring-boot-starter-amqp")
    implementation("org.springframework.boot:spring-boot-starter-websocket")
    implementation("org.keycloak:keycloak-spring-boot-starter")
    implementation("org.keycloak:keycloak-spring-boot-starter:17.0.1")


    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(group = "io.vavr", name = "vavr", version = "0.10.3")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
