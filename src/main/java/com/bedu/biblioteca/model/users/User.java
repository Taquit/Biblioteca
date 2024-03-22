package com.bedu.biblioteca.model.users;

import com.bedu.biblioteca.model.MainUser;
import com.sun.tools.javac.Main;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
public class User extends MainUser {

    private String prueba;
}
