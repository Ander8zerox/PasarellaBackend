package com.pasarella.prestamos.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class Local {

    private Long idLocal;
    @NotBlank(message = "localName may not be blank")
    private String localName;
    @NotBlank(message = "localNumber may not be blank")
    private String localNumber;
    @NotBlank(message = "isActive may not be blank")
    private Boolean isActive;
    @NotBlank(message = "users may not be blank")
    private List<User> users;
}
