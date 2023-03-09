package com.example.news_project.entity;

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
        @Index(name = "category_name_index", columnList = "name_uz"),
        @Index(name = "category_created_by_index", columnList = "created_by"),
//        @Index(name = "category_category_index", columnList = "category_id"),
        @Index(name = "category_status_index", columnList = "is_active")

})
@Entity
public class Category extends Auditable{
    @Column(nullable = false, name = "name_uz")
    private String nameUz;

    @Column(nullable = false, name = "name_ru")
    private String nameRu;

    @Column(nullable = false, name = "name_eng")
    private String nameEng;

//    @Column(nullable = false, name = "category_id")
//    private String categoryId;

    @OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL)
    private Set<Category> subCategories = new HashSet<>();

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Category parentCategory;


    @OneToMany(mappedBy="category")
    private Set<Publication> publications ;

}
