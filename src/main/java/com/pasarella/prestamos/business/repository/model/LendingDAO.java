package com.pasarella.prestamos.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_lendings")
public class LendingDAO {

    @Column(name="id_lending")
    private String idLending;
    @Column(name="date_lending")
    private String dateLending;
    @Column(name="id_customer")
    private Long idCustomer;
    @Column(name="status")
    private String status;
    @Column(name="price")
    private String price;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_product")
    private ArrayList<ProductDAO> products;
    @Column(name="observation")
    private String observation;
    @Column(name="id_local_creation")
    private Long idLocalCreation;
}
