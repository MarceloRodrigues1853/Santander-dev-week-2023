package me.dio.domain.model;

import jakarta.persistence.Entity;

// Entidade que representa uma notícia do sistema, extendendo a classe BaseItem
@Entity(name = "tb_news")
public class News extends BaseItem {

}
