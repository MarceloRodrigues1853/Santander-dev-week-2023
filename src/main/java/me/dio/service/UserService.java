package me.dio.service;

// Importa a classe User do pacote me.dio.domain.model
import me.dio.domain.model.User;

// Interface que define os métodos para o serviço relacionado ao usuário
public interface UserService extends CrudService<Long, User> {

}
