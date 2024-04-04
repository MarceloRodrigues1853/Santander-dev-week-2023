package me.dio.domain.model;

// Importações necessárias para definição da entidade JPA
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Definição da entidade Account que será mapeada para a tabela tb_account no banco de dados
@Entity(name = "tb_account")
public class Account {

    // Identificador único da conta, gerado automaticamente pelo banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Número da conta, único e não nulo
    @Column(unique = true)
    private String number;

    // Agência da conta
    private String agency;

    // Saldo da conta, com precisão de 13 dígitos e escala de 2 casas decimais
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    // Limite adicional da conta, com precisão de 13 dígitos e escala de 2 casas decimais
    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    // Métodos getters e setters para acessar e modificar os atributos da entidade
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

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

}
