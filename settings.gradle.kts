pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "multimodule"
include(":app")
include(":common")
include(":common:data")
include(":common:domain")
include(":common:presentation")
include(":feature")
include(":navigation")
include(":feature:login")
include(":feature:login:data")
include(":feature:login:domain")
include(":feature:login:presentation")
