package com.example.news.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories", indexes = {
        @Index(name = "category_created_by_index", columnList = "created_by"),
//        @Index(name = "category_category_index", columnList = "category_id"),
        @Index(name = "category_status_index", columnList = "is_active")

})
@Entity
public class Category extends Auditable {
    @OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL)
    private Set<Category> subCategories = new HashSet<>();

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Category parentCategory;

    @OneToMany(mappedBy="category")
    private Set<Publication> publications ;

}
