package com.github.jeppels.kotlinmockitojunit5codegenerator.services

import com.intellij.openapi.project.Project
import com.github.jeppels.kotlinmockitojunit5codegenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
