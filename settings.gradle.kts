pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/LeonardoMonteiro02/Avancada3.0")
            credentials {
                username = "LeonardoMonteiro02"
                password = "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"
            }
        }
    }
}

rootProject.name = "Avancada3.1"
include(":app")
 