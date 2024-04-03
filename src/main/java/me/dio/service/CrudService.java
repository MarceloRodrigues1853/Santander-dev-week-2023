package me.dio.service;

import java.util.List;

// Interface genérica que define métodos CRUD básicos
public interface CrudService<ID, T> {
    // Método para encontrar todos os elementos do tipo T
    List<T> findAll();

    // Método para encontrar um elemento do tipo T por ID
    T findById(ID id);

    // Método para criar um novo elemento do tipo T
    T create(T entity);

    // Método para atualizar um elemento do tipo T por ID
    T update(ID id, T entity);

    // Método para excluir um elemento do tipo T por ID
    void delete(ID id);
}
