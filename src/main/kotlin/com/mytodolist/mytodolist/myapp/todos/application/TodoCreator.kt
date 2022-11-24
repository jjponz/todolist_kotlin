package com.mytodolist.mytodolist.myapp.todos.application

import com.mytodolist.mytodolist.myapp.todos.domain.Description
import com.mytodolist.mytodolist.myapp.todos.domain.Todo
import com.mytodolist.mytodolist.myapp.todos.domain.TodoId
import java.time.LocalDateTime

class TodoCreator() {

    fun create(id: String, name: String, description: String) : Todo {
        return Todo(TodoId.fromString(id), name, Description(description), LocalDateTime.now())
    }
}