package com.example.news.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "languages")
@Entity
public class Language extends Auditable {

    @OneToMany(mappedBy="language")
    private Set<InfoValue> infoValues ;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "definition")
    private String definition;


}
