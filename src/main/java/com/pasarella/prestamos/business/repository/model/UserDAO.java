package com.pasarella.prestamos.business.repository.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tb_users")
public class UserDAO {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_user")
    private Long idUser;
    @Column(name="user_name",unique = true)
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="is_active")
    private Boolean isActive;
    @Column(name="id_local_creation")
    private String idLocalCreation;
    @ManyToOne
    @JoinColumn(name="id_local")
    private LocalDAO local;
}
