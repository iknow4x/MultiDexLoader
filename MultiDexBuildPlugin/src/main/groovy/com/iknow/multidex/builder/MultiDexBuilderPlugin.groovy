package com.iknow.multidex.builder

import org.gradle.api.Plugin
import org.gradle.api.Project

class MultiDexBuilderPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.task('builderTask') << {
            println "Hello world!"
        }
    }
}
