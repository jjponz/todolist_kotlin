package com.mytodolist.mytodolist.myapp.todos.domain

sealed class TodoException(override val message: String, override val cause: Throwable? = null) : RuntimeException(message, cause)

data class InvalidTodoIdException(val id: String, override val cause: Throwable?) : TodoException("The id <$id> is not a valid course id", cause)
data class InvalidDescriptionException(val name: String) : TodoException("The name <$name> is not a valid course name")
class TodoNotFound() : RuntimeException()