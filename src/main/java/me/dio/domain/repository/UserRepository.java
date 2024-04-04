package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;

// Repositório para a entidade User, que estende JpaRepository e trabalha com entidades do tipo User e IDs do tipo Long
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Verifica se já existe uma conta com o número especificado
    boolean existsByAccountNumber(String number);

    // Verifica se já existe um cartão com o número especificado
    boolean existsByCardNumber(String number);
}
