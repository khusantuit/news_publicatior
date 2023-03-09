package com.example.news_project.repository;

import com.example.news_project.criteria.BaseCriteria;
import com.example.news_project.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface AbstractRepository <
        C extends BaseCriteria,
        E extends BaseEntity,
        K extends Serializable
        > extends JpaRepository<E, K>, BaseRepository {


}
