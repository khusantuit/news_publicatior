package com.example.news.repository.info;

import com.example.news.criteria.info.InfoCriteria;
import com.example.news.entity.Category;
import com.example.news.entity.Info;
import com.example.news.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InfoRepository extends AbstractRepository<
            InfoCriteria,
            Info,
            String
        > {

    List<Info> findPublicationByDeletedFalse();

    List<Info> findAllByParentIdAndKeyContainingIgnoreCaseAndDeletedFalse(String parentId, String key);


    List<Info> findAllByCreatedByAndDeletedFalse(String userId);
//    double countAllByCreatedByAndStatusIsTrueAndDeletedIsFalse(String userId);

    Optional<Info> findByIdAndDeletedFalse(String id);

    List<Info> findAllByParentIdAndDeletedFalse(String id);

}
