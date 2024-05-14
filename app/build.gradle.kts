plugins {
    id("java")
    application
    jacoco
    checkstyle
    id("com.github.ben-manes.versions") version "0.50.0"
    id ("com.adarshr.test-logger") version "3.1.0"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application { mainClass.set("hexlet.code.App") }

dependencies {
    implementation("org.assertj:assertj-core:3.21.0")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.21.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.1")
}

tasks.test {
    useJUnitPlatform()
}

testlogger {
    showStandardStreams = true
}

tasks.jacocoTestReport { reports { xml.required.set(true) } }