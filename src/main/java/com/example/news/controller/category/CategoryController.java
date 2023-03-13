package com.example.news.controller.category;

import com.example.news.controller.AbstractController;
import com.example.news.criteria.category.CategoryCriteria;
import com.example.news.dto.category.CategoryCreateDto;
import com.example.news.dto.category.CategoryDto;
import com.example.news.dto.category.CategoryUpdateDto;
import com.example.news.dto.data.DataDto;
import com.example.news.services.category.CategoryServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.news.controller.AbstractController.PATH;

@RestController
@RequestMapping(PATH + "/category")
public class CategoryController extends AbstractController<
            CategoryServiceImpl,
            CategoryDto,
            CategoryCreateDto,
            CategoryUpdateDto,
            String,
            CategoryCriteria> {

    public CategoryController(CategoryServiceImpl service) {
        super(service);
    }

    @Override
    @PostMapping("/create")
    protected ResponseEntity<DataDto<String>> create(@RequestBody CategoryCreateDto dto) {
        return new ResponseEntity<>(new DataDto<>(service.create(dto)), HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    protected ResponseEntity<DataDto<String>> delete(@PathVariable String s) {
        service.delete(s);
        return new ResponseEntity<>(new DataDto<>("deleted"), HttpStatus.OK);
    }

    @Override
    @PutMapping("/update/{id}")
    protected ResponseEntity<DataDto<String>> update(@RequestBody CategoryUpdateDto dto, @PathVariable String id) {
        dto.setId(id);
        service.update(dto);

        return new ResponseEntity<>(new DataDto<>("updated"), HttpStatus.OK);
    }

    @Override
    @GetMapping("/get/{id}")
    protected ResponseEntity<DataDto<CategoryDto>> get(@PathVariable String id) {
        return new ResponseEntity<>(new DataDto<>(service.get(id)), HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    protected ResponseEntity<DataDto<List<CategoryDto>>> getAll(CategoryCriteria criteria) {
        return new ResponseEntity<>(new DataDto<>(service.getAll(criteria)), HttpStatus.OK);
    }
}
