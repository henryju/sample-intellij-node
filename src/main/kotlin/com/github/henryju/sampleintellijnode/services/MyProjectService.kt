package com.github.henryju.sampleintellijnode.services

import com.intellij.openapi.project.Project
import com.github.henryju.sampleintellijnode.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
