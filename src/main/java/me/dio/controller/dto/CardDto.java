package me.dio.controller.dto;

import me.dio.domain.model.Card;

import java.math.BigDecimal;

// DTO para representar os dados de um cartão
public record CardDto(Long id, String number, BigDecimal limit) {

    // Construtor que recebe um modelo de cartão e converte para DTO
    public CardDto(Card model) {
        this(model.getId(), model.getNumber(), model.getLimit());
    }

    // Método para converter DTO de volta para o modelo de cartão
    public Card toModel() {
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setLimit(this.limit);
        return model;
    }
}
