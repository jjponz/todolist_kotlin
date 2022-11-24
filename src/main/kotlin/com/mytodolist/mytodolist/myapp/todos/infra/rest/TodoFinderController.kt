package com.mytodolist.mytodolist.myapp.todos.infra.rest

import com.mytodolist.mytodolist.myapp.todos.application.TodoFinder
import com.mytodolist.mytodolist.myapp.todos.domain.TodoNotFound
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoFinderController(private val todoFinder: TodoFinder) {

    @GetMapping("/todos/{id}")
    fun execute(@PathVariable id: String): ResponseEntity<out Any> {
        return try {
            val todo = todoFinder.execute(id)
            return ResponseEntity.ok().body(todo)
        } catch (exception: TodoNotFound) {
            return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("The todo id is not valid")
        }

    }
}