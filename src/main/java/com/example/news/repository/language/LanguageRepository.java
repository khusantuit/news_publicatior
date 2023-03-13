package com.example.news.repository.language;

import com.example.news.criteria.language.LanguageCriteria;
import com.example.news.entity.InfoValue;
import com.example.news.entity.Language;
import com.example.news.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LanguageRepository extends AbstractRepository<
            LanguageCriteria,
            Language,
            String
        > {

    Optional<Language> findByIdAndDeletedFalse(String id);

    Optional<Language> findAllByIdAndDeletedFalse(String id);

}
