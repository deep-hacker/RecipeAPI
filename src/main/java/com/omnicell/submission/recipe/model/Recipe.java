package com.omnicell.submission.recipe.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "RECIPE")
public class Recipe implements Serializable {
    @Column(name = "ID") @Id @Getter @Setter @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME") @Getter @Setter
    private String name;
    @Column(name = "IMAGE") @Getter @Setter
    private String image;
    @Column(name = "CATEGORY") @Getter @Setter
    private String category;
    @Column(name = "LABEL") @Getter @Setter
    private String label;
    @Column(name= "DESCRIPTION") @Getter @Setter
    private String description;
    @Column(name= "PRICE") @Getter @Setter
    private Double price;

    public Recipe() {

    }
}
