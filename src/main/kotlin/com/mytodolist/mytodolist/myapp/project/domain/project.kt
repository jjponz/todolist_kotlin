package com.mytodolist.mytodolist.myapp.project.domain

data class project (
    val id: String,
    val name: String,
    val owner: String,
    val todolist: List<TodoProject>
    )