package com.pasarella.prestamos.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_customers")
public class CustomerDAO {

    @Id
    @Column(name="id_user")
    private Long idUser;
    @Column(name="id_local")
    private Long idLocal;
    @Column(name="name")
    private String name;
    @Column(name="document")
    private Integer document;
    @Column(name="telephone")
    private String telephone;
    @Column(name="localName")
    private String localName;
    @Column(name="gender")
    private String gender;
}
