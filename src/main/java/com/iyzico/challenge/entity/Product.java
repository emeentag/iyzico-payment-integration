package com.iyzico.challenge.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

/**
 * Product
 */
@Entity
@Data
public class Product {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "name", columnDefinition = "VARCHAR(120)", nullable = false)
  private String name;

  @Column(name = "details", columnDefinition = "TEXT", nullable = true)
  private String details;

  @Column(name = "price", columnDefinition = "DECIMAL", nullable = false)
  private BigDecimal price;

  @Column(name = "stock_count", columnDefinition = "BIGINT", nullable = false)
  private Long stockCount;

  @ManyToMany(mappedBy = "products")
  private List<Basket> baskets;
}