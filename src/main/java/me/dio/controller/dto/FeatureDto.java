package me.dio.controller.dto;

import me.dio.domain.model.Feature;

// DTO para representar os dados de uma característica
public record FeatureDto(Long id, String icon, String description) {

    // Construtor que recebe um modelo de característica e converte para DTO
    public FeatureDto(Feature model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    // Método para converter DTO de volta para o modelo de característica
    public Feature toModel() {
        Feature model = new Feature();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}
