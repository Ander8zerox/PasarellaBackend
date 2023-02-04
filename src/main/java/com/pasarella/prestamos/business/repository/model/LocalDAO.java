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
@Table(name="tb_locals")
public class LocalDAO {

    @Id
    @Column(name="id_local")
    private String idLocal;
    @Column(name="local_name")
    private String localName;
    @Column(name="local_number")
    private String localNumber;
    @Column(name="is_active")
    private Boolean isActive;
}
