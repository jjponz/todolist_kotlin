package com.mytodolist.mytodolist.myapp.todos.domain

interface TodoRepository {
    fun get(uuid: String) : Todo
}