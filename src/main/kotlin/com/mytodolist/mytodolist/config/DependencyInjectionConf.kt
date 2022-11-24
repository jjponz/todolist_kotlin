package com.mytodolist.mytodolist.config

import com.mytodolist.mytodolist.myapp.todos.application.TodoCreator
import com.mytodolist.mytodolist.myapp.todos.application.TodoFinder
import com.mytodolist.mytodolist.myapp.todos.domain.TodoRepository
import com.mytodolist.mytodolist.myapp.todos.infra.repos.FakeTodoRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DependencyInjectionConf {

    @Bean
    fun todoRepository() = FakeTodoRepository()

    @Bean
    fun todoFinder(todoRepository: TodoRepository) = TodoFinder(todoRepository)

    @Bean
    fun todoCreator(todoRepository: TodoRepository) = TodoCreator()
}