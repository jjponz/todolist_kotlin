package com.mytodolist.mytodolist.myapp.todos.domain

import java.time.LocalDateTime
import java.util.UUID

data class TodoId(val value: UUID) {
    companion object {
        fun fromString(id: String) = try {
            TodoId(UUID.fromString(id))
        } catch (exception: Exception) {
            throw InvalidTodoIdException(id, exception)
        }
    }
}
data class Description(val value: String) {
    init {
        validate()
    }

    private fun validate() {
        if (value.isEmpty() || value.isBlank()) {
            throw InvalidDescriptionException(value)
        }
    }
}

data class Todo(
    val id: TodoId,
    val name: String,
    val description: Description,
    val todoProject: String,
    val createdAt: LocalDateTime
)