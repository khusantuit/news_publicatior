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
@Table(name = "publications", indexes = {
        @Index(name = "publication_count_views", columnList = "count_views"),
})
@Entity
public class Publication extends Auditable {
    @Column(name = "count_views")
    private int countViews;

    @ManyToOne
    @JoinColumn(name="category_id", foreignKey = @ForeignKey(name="FK_CATEGORY__ID"), nullable=false)
    private Category category;

    @OneToMany(mappedBy="publication")
    private Set<Paragraph> paragraphs ;


}
