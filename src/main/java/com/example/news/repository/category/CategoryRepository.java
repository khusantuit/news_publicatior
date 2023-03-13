package com.example.news.repository.category;

import com.example.news.criteria.category.CategoryCriteria;
import com.example.news.entity.Category;
import com.example.news.entity.Publication;
import com.example.news.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CategoryRepository extends AbstractRepository<
            CategoryCriteria,
            Category,
            String
        > {
    List<Category> findAllByDeletedFalse();


    @Query(value = "select c from Category c left join Info i on i.parentId = c.id left join InfoValue if on if.info.key = ?1 " +
            "where if.value like '%?2%'")
    List<Category> findAllByNameContainingIgnoreCaseAndDeletedFalse(String key, String value);


    List<Category> findAllByCreatedByAndDeletedFalse(String userId);
//    double countAllByCreatedByAndStatusIsTrueAndDeletedIsFalse(String userId);

    Optional<Category> findByIdAndDeletedFalse(String id);
}
