package com.example.news.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "paragraphs", indexes = {
        @Index(name = "publication_queue", columnList = "queue"),
})
@Entity
public class Paragraph extends Auditable{
    private int queue;

    @ManyToOne
    @JoinColumn(name="publication_id", foreignKey = @ForeignKey(name="FK_PUBLICATION__ID"), nullable=false)
    private Publication publication;

    private String imagePath;
}
