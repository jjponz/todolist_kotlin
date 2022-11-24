package com.mytodolist.mytodolist.myapp.project.domain

interface ProjectRepository {
    fun Get(uuid: String) : Boolean
}