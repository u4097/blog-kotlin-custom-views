plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(25)
    defaultConfig {
        applicationId="info.ericlin.kotlin.customviews"
        minSdkVersion(14)
        targetSdkVersion(25)
        versionCode=1
        versionName="1.0"
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.20")
    implementation("com.android.support:appcompat-v7:25.4.0")
    testImplementation("junit:junit:4.12")
    implementation("com.android.support.constraint:constraint-layout:1.1.3")
}
