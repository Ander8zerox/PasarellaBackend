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
    @Column(name="id_customer")
    private Long idCustomer;
    @Column(name="name")
    private String name;
    @Column(name="document")
    private Integer document;
    @Column(name="telephone")
    private String telephone;
    @Column(name="job_local_name")
    private String jobLocalName;
    @Column(name="gender")
    private String gender;
    @Column(name="id_local_creation")
    private Long idLocalCreation;
}
