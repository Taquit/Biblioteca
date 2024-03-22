package com.bedu.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
public class MainUser {
    private List<Book> borrowBook;

    @Id
    private Long id;

    private String name;
    private String type;
    private String email;
    @OneToOne(mappedBy = "prueba", optional = false)
    private Book prueba;


}
