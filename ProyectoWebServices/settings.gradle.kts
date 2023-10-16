plugins {
    id 'java'
    id 'org.springframework.boot' version '2.6.0'
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'com.h2database:h2'
}

application {
    mainClass = 'com.example.Application'
}

group = 'com.example'
version = '1.0-SNAPSHOT'
