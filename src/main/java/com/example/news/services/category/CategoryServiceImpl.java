package com.example.news.services.category;

import com.example.news.criteria.category.CategoryCriteria;
import com.example.news.dto.category.CategoryCreateDto;
import com.example.news.dto.category.CategoryDto;
import com.example.news.dto.category.CategoryUpdateDto;
import com.example.news.dto.info.InfoCreateDto;
import com.example.news.dto.info.InfoValueCreateDto;
import com.example.news.entity.Category;
import com.example.news.entity.Info;
import com.example.news.exception.custom.NullElementException;
import com.example.news.mapper.category.CategoryMapper;
import com.example.news.repository.category.CategoryRepository;
import com.example.news.repository.info.InfoRepository;
import com.example.news.services.AbstractService;
import com.example.news.services.info.InfoServiceImpl;
import com.example.news.services.info.InfoValueService;
import com.example.news.services.info.InfoValueServiceImpl;
import com.example.news.validation.category.CategoryValidator;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Transactional
@Service
public class CategoryServiceImpl extends AbstractService<
            CategoryRepository,
            CategoryMapper,
            CategoryValidator
        > implements CategoryService{
    @Autowired
    InfoServiceImpl infoService;
    @Autowired
    InfoValueServiceImpl infoValueService;

    public CategoryServiceImpl(CategoryRepository repository, @Qualifier("categoryMapperImpl") CategoryMapper mapper, CategoryValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public CategoryDto get(String id) {
        validator.validateKey(id);

        Optional<Category> categoryOptional = repository.findByIdAndDeletedFalse(id);
        if(categoryOptional.isPresent()) {
            Category category = categoryOptional.get();

            CategoryDto categoryDto = mapper.toDto(category);

            categoryDto.setInfoList(infoService.getAllByParentId(id));


            return categoryDto;
        }

        throw new NullElementException("No category with id: " + id);
    }

    @Override
    public List<CategoryDto> getAll(CategoryCriteria criteria) {
        if (criteria.getKeyAndValues().isEmpty())
            return mapper.toDto(repository.findAllByDeletedFalse());
        else {
            Map<String, String> map = criteria.getKeyAndValues();

            List<Category> totalList = new ArrayList<>();

            for (String key : map.keySet()) {
                String value = map.get(key);

                totalList.addAll(repository.findAllByNameContainingIgnoreCaseAndDeletedFalse(key, value));
            }

            return mapper.toDto(totalList);
        }
    }

    @Override
    public String create(CategoryCreateDto dto) {
        validator.validOnCreate(dto);

        Category category = mapper.fromCreateDto(dto);



        category = repository.save(category);

        for (InfoCreateDto infoCreateDto : dto.getInfoList()) {
            infoService.create(infoCreateDto, category.getId());
        }

        return category.getId();
    }

    @Override
    public void update(CategoryUpdateDto dto) {

    }

    @Override
    public void delete(String s) {

    }
}
