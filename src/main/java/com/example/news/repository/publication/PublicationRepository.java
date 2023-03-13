package com.example.news.repository.publication;

import com.example.news.criteria.publication.PublicationCriteria;
import com.example.news.entity.Category;
import com.example.news.entity.Publication;
import com.example.news.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PublicationRepository extends AbstractRepository<PublicationCriteria, Publication, String> {
    Optional<Publication> findByIdAndDeletedFalse(String id);

    List<Publication> findAllByCreatedByAndDeletedFalse(String userId);
//    double countAllByCreatedByAndStatusIsTrueAndDeletedIsFalse(String userId);
    @Query(value = "select p from Publication p left join Info i on i.parentId = p.id left join InfoValue iv on iv.info = i and iv.info.key = ?1 " +
        "where iv.value like '%?2%'")
    List<Category> findAllByNameContainingIgnoreCaseAndDeletedFalse(String key, String value);
}
