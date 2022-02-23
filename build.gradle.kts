import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.phoenix"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//def arch_version = "2.5.0-alpha02"

dependencies {
    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-android
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")
    // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-ktx
    //implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
    // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-ktx
    //implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}