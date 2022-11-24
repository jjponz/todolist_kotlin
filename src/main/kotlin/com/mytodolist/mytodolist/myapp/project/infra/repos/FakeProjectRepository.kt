package com.mytodolist.mytodolist.myapp.project.infra.repos

import com.mytodolist.mytodolist.myapp.project.domain.ProjectRepository

class FakeProjectRepository : ProjectRepository {
    override fun Get(uuid: String): Boolean {
        return true
        /*Aqui hariamos una query con el inner join y lo mapeamos a nuestro modelo de dominio*/
    }
}