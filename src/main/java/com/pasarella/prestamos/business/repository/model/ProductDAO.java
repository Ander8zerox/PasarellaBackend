package com.pasarella.prestamos.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_products")
public class ProductDAO {

    @Column(name="id_product")
    private Long idProduct;
    @Column(name="code")
    private Long code;
    @Column(name="name")
    private Long name;
    @Column(name="price")
    private Long price;
    @Column(name="id_local_creation")
    private Long idLocalCreation;
}
