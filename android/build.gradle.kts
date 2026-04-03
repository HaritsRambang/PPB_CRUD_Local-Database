allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val newBuildDir: Directory =
    rootProject.layout.buildDirectory
        .dir("../../build")
        .get()
rootProject.layout.buildDirectory.value(newBuildDir)

subprojects {
    afterEvaluate {
        if (plugins.hasPlugin("com.android.application") || plugins.hasPlugin("com.android.library")) {
            configure<com.android.build.gradle.BaseExtension> {
                compileSdkVersion(34)
                buildToolsVersion("34.0.0")
                if (namespace == null) {
                    namespace = project.group.toString()
                }
            }
        }
    }
    project.buildDir = File(rootProject.buildDir, project.name)
    project.evaluationDependsOn(":app")
}