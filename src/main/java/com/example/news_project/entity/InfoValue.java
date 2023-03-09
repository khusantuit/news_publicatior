package com.example.news_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "InfoValues")
@Entity
public class InfoValue extends Auditable{
    @ManyToOne
    @JoinColumn(name="language_name", foreignKey = @ForeignKey(name="FK_LANGUAGE__NAME"), nullable=false)
    private Language language;

    @Column(name = "value")
    private String value;

    @ManyToOne
    @JoinColumn(name="info_id", foreignKey = @ForeignKey(name="FK_info_id"), nullable=false)
    private Info info;
}
