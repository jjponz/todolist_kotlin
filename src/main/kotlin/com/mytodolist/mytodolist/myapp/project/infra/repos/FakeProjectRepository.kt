package com.mytodolist.mytodolist.myapp.project.infra.repos

import com.mytodolist.mytodolist.myapp.project.domain.ProjectRepository

class FakeProjectRepository : ProjectRepository {
    override fun Get(uuid: String): Boolean {
        return true
    }
}