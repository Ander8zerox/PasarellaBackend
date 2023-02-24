package com.pasarella.prestamos.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_lendings")
public class LendingDAO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_lending")
    private Long idLending;
    @Column(name="date_lending")
    private String dateLending;
    @Column(name="customer_name")
    private String customerName;
    @Column(name="id_customer")
    private Long idCustomer;
    @Column(name="jobLocal")
    private String jobLocal;
    @Column(name="status")
    private String status;
    @Column(name="total_amount")
    private BigDecimal totalAmount;
    @ManyToMany
    @JoinTable( name="tb_lendings_products",
                joinColumns = @JoinColumn(name="id_lending"),
                inverseJoinColumns = @JoinColumn(name="id_product"))
    private List<ProductDAO> products;
    @Column(name="observation")
    private String observation;
    @Column(name="id_local_creation")
    private Long idLocalCreation;
}
