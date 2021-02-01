package io.github.Wafilh0.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.Wafilh0.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
