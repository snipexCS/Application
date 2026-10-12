plugins {
    id("texteditor-java-convention")
    application
    antlr
    id("org.openjfx.javafxplugin") version "0.1.0"
}

javafx {
    version = "21.0.5"
    modules = listOf("javafx.controls")
}

dependencies {
    implementation(project(":api"))

    // On the classpath so "edu.curtin.texteditor.DatePlugin" works by class name
    runtimeOnly(project(":dateplugin"))
    runtimeOnly(project(":findplugin"))

    antlr("org.antlr:antlr4:4.13.2")
    implementation("org.antlr:antlr4-runtime:4.13.2")

    // Scripting
    implementation("org.apache.groovy:groovy:5.0.6")
    implementation("org.apache.groovy:groovy-jsr223:5.0.6")
}

application {
    mainClass = "edu.curtin.texteditor.App"
}

tasks.generateGrammarSource {
    arguments = arguments + listOf("-visitor", "-no-listener")
}

// Run from the project root so scripts like emoji.groovy are easy to find
tasks.named<JavaExec>("run") {
    workingDir = rootProject.projectDir
}
