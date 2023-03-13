package com.example.news.repository;

import com.example.news.criteria.BaseCriteria;
import com.example.news.entity.BaseEntity;
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
