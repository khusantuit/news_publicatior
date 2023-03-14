package com.example.news.repository.publication;

import com.example.news.criteria.publication.paragraph.ParagraphCriteria;
import com.example.news.entity.Paragraph;
import com.example.news.entity.Publication;
import com.example.news.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParagraphRepository extends AbstractRepository<
        ParagraphCriteria,
        Paragraph,
        String> {

    List<Paragraph> findPublicationByDeletedFalse();

    List<Paragraph> findAllByCreatedByAndDeletedFalse(String userId);
//    double countAllByCreatedByAndStatusIsTrueAndDeletedIsFalse(String userId);

    List<Paragraph> findAllByDeletedFalse();

}
