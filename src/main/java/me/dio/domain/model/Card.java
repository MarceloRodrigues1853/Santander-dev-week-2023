package me.dio.domain.model;

// Importações necessárias para definição de entidades JPA
import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Entidade que representa um cartão
@Entity(name = "tb_card")
public class Card {

    // Identificador único do cartão, gerado automaticamente pelo banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Número único associado ao cartão
    @Column(unique = true)
    private String number;

    // Limite disponível no cartão
    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    // Métodos getters e setters para acessar e modificar os atributos do cartão
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

}
