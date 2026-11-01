plugins {
    id("com.android.application")
}

android {
    namespace = "io.appforshare.sample"
    compileSdk = 35
    defaultConfig {
        applicationId = "io.appforshare.sample"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "0.0.1"
    }
    flavorDimensions += "env"
    productFlavors {
        create("prod") { dimension = "env" }
        create("dev") { dimension = "env"; applicationIdSuffix = ".dev" }
    }
}
