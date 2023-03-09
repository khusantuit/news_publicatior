package com.example.news_project.entity;

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
@Table(name = "infos")
@Entity
public class Info extends Auditable{
    @Column(name = "parent_id", nullable = false)
    private String parentId;

    @Column(name = "key")
    private String key;

    @OneToMany(mappedBy="info")
    private Set<InfoValue> infoValues ;

}
