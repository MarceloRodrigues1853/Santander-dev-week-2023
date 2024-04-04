package me.dio.controller.dto;

import me.dio.domain.model.News;

// DTO para representar os dados de uma notícia
public record NewsDto(Long id, String icon, String description) {

    // Construtor que recebe um modelo de notícia e converte para DTO
    public NewsDto(News model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    // Método para converter DTO de volta para o modelo de notícia
    public News toModel() {
        News model = new News();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}
