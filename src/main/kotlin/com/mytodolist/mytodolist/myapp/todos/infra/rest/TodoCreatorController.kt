package com.mytodolist.mytodolist.myapp.todos.infra.rest

import com.mytodolist.mytodolist.myapp.todos.application.TodoCreator
import com.mytodolist.mytodolist.myapp.todos.application.TodoFinder
import com.mytodolist.mytodolist.myapp.todos.domain.InvalidDescriptionException
import com.mytodolist.mytodolist.myapp.todos.domain.InvalidTodoIdException
import com.mytodolist.mytodolist.myapp.todos.domain.TodoException
import com.mytodolist.mytodolist.myapp.todos.domain.TodoNotFound
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
class TodoCreatorController(private val todoCreator: TodoCreator) {

    @PostMapping("/todos")
    fun execute(
        @RequestBody request: CreateTodoRequest
    ): ResponseEntity<String> {
        return try {
            todoCreator.create(request.id, request.name, request.description, request.project)
            ResponseEntity.created(URI.create("/course/${request.id}")).build()
        } catch (exception: TodoException) {
            when (exception) {
                is InvalidTodoIdException -> ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("The todo id is not valid")

                is InvalidDescriptionException -> ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("The todo name is not valid")
            }
        } catch (exception: Throwable) {
            ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .build()
        }
    }
}

data class CreateTodoRequest(
    val id: String,
    val name: String,
    val description: String,
    val project: String
)