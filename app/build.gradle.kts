plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.hakanbey.multimodule"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.hakanbey.multimodule"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    sourceSets {
        getByName("debug").res.srcDirs("$rootDir/navigation/src/main/sharedRes")
    }
}

dependencies {

    implementation(projects.common.data)
    implementation(projects.common.domain)
    implementation(projects.common.presentation)

    implementation(projects.feature.login.data)
    implementation(projects.feature.login.domain)
    implementation(projects.feature.login.presentation)

    implementation(projects.feature.home.data)
    implementation(projects.feature.home.domain)
    implementation(projects.feature.home.presentation)

    implementation(projects.navigation)

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)

    //  Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
}