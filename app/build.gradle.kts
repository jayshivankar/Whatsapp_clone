plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

}

android {
    namespace = "com.example.whatsapp_clone"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.whatsapp_clone"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    //Dagger Hilt
    implementation ("com.google.dagger: hilt-android:2.44.2")

    implementation ("androidx. fragment: fragment-ktx: 1.5.7")
// Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room: room-runtime: 2.5.1")
// Coroutines
    implementation ("org.jetbrains.kotlinx: kotlinx-coroutines-core:1.6.4")
    implementation ("org.jetbrains.kotlinx: kotlinx-coroutines-android:1.6.4")
// Retrofit
    implementation ("com.squareup.retrofit2: retrofit: 2.9.0")
    implementation ("com.squareup.retrofit2: converter-moshi:2.9.0")
    implementation ("com.squareup.okhttp3: okhttp:5.0.0-alpha.3")
    implementation ("com.squareup.okhttp3: logging-interceptor: 5.0.0-alpha.3")
    implementation ("com.google.code.gson: gson:2.9.0")

    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation("com.google.firebase:firebase-auth-ktx:22.3.1")
    implementation("com.google.firebase:firebase-firestore-ktx:24.11.1")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}