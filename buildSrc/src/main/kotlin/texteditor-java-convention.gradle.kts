plugins {
    java
    pmd
}

version = "1.0.0"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xlint:all,-serial")
}

pmd {
    setConsoleOutput(true)
    toolVersion = "7.26.0"
    rulesMinimumPriority = 5
    ruleSets = listOf()
    ruleSetFiles = files(rootProject.file("saed-pmd-rules.xml"))
}

// Don't lint ANTLR-generated code
tasks.withType<Pmd> {
    exclude { it.file.path.contains("generated-src") }
}
