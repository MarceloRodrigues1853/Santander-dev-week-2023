package me.dio.domain.model;

// Importações necessárias para definição de entidades JPA
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

// Classe base abstrata para itens que possuem identificador único, ícone e descrição
@MappedSuperclass
public abstract class BaseItem {

    // Identificador único do item, gerado automaticamente pelo banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Ícone associado ao item
    private String icon;

    // Descrição do item
    private String description;

    // Métodos getters e setters para acessar e modificar os atributos do item
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
