package com.pasarella.prestamos.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_products")
public class ProductDAO {

    @Id
    @GeneratedValue
    @Column(name="id_product")
    private Long idProduct;
    @Column(name="code",unique = true)
    private String code;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private String price;
    @Column(name="id_local_creation")
    private Long idLocalCreation;
}
