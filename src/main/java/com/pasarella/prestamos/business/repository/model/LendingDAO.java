package com.pasarella.prestamos.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_lendings")
public class LendingDAO {

    @Id
    @Column(name="id_lending")
    private Long idLending;
    @Column(name="date_lending")
    private String dateLending;
    @Column(name="id_customer")
    private Long idCustomer;
    @Column(name="status")
    private String status;
    @Column(name="total_amount")
    private String totalAmount;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ProductDAO> products;
    @Column(name="observation")
    private String observation;
    @Column(name="id_local_creation")
    private Long idLocalCreation;
}
