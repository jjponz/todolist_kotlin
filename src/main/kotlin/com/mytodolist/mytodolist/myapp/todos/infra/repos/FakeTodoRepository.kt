package com.mytodolist.mytodolist.myapp.todos.infra.repos

import com.mytodolist.mytodolist.myapp.todos.domain.*
import java.time.LocalDateTime

class FakeTodoRepository : TodoRepository {
    override fun get(uuid: String): Todo {
        if (uuid == "1")
            return Todo(
                TodoId.fromString("caebae03-3ee9-4aef-b041-21a400fa1bb7"),
                "name",
                Description("my description"),
                "myproject",
                LocalDateTime.now()
            )
        throw TodoNotFound()
    }
}