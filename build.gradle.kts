
plugins {
    id("com.gradle.build-scan") version "2.1"
}

buildScan {
    termsOfServiceUrl = "https://com.gradle/terms-of-service"
    termsOfServiceAgree = "yes"
    publishAlways()
}

buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0-alpha03")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.20")

    }
}

allprojects {
    repositories {
        jcenter()
        google()
    }
}

tasks.register("clean",Delete::class.java) {
    delete(rootProject.buildDir)
}
