package com.example.news.repository.info;

import com.example.news.criteria.info.InfoValueCriteria;
import com.example.news.entity.Info;
import com.example.news.entity.InfoValue;
import com.example.news.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InfoValueRepository extends AbstractRepository<
        InfoValueCriteria,
        InfoValue,
        String
        > {

    Optional<InfoValue> findByIdAndDeletedFalse(String id);

    List<InfoValue> findAllByInfoIdAndDeletedFalse(String id);
}
