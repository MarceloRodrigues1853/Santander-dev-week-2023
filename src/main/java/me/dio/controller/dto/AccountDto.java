package me.dio.controller.dto;

import me.dio.domain.model.Account;

import java.math.BigDecimal;

// DTO para representar os dados de uma conta
public record AccountDto(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {

    // Construtor que recebe um modelo de conta e converte para DTO
    public AccountDto(Account model) {
        this(model.getId(), model.getNumber(), model.getAgency(), model.getBalance(), model.getLimit());
    }

    // Método para converter DTO de volta para o modelo de conta
    public Account toModel() {
        Account model = new Account();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setAgency(this.agency);
        model.setBalance(this.balance);
        model.setLimit(this.limit);
        return model;
    }
}
