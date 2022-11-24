package com.mytodolist.mytodolist.myapp.todos.application

import com.mytodolist.mytodolist.myapp.todos.domain.Todo
import com.mytodolist.mytodolist.myapp.todos.domain.TodoId
import com.mytodolist.mytodolist.myapp.todos.domain.TodoRepository

class TodoFinder (private val todoRepository: TodoRepository) {
    fun execute(courseId: String): Todo {
        return todoRepository.get(courseId)
    }
}
