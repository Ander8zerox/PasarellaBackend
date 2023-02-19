package com.pasarella.prestamos.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_locals")
public class LocalDAO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_local")
    private Long idLocal;
    @Column(name="local_name")
    private String localName;
    @Column(name="local_number")
    private String localNumber;
    @Column(name="is_active")
    private Boolean isActive;
}
