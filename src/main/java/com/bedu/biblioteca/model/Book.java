package com.bedu.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
public class Book {
    @Id
    private Long id;

    private String title;
    private String author;
    private Integer publishYear;
    private Boolean borrow = false;
    @OneToOne(optional = false)
    private MainUser prueba;


}
