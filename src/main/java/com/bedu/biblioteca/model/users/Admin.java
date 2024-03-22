package com.bedu.biblioteca.model.users;

import com.bedu.biblioteca.model.MainUser;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
public class Admin extends MainUser {
    private String department;

}
