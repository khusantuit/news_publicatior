package com.example.news_project.repository.publication;

import com.example.news_project.criteria.publication.PublicationCriteria;
import com.example.news_project.entity.Publication;
import com.example.news_project.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationRepository extends AbstractRepository<PublicationCriteria, Publication, String> {
    List<Publication> findPublicationByDeletedFalse();

    List<Publication> findAllByCreatedByAndDeletedFalse(String userId);
//    double countAllByCreatedByAndStatusIsTrueAndDeletedIsFalse(String userId);

}
