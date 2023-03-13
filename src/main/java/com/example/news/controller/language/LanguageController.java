package com.example.news.controller.language;

import com.example.news.controller.AbstractController;
import com.example.news.criteria.language.LanguageCriteria;
import com.example.news.dto.data.DataDto;
import com.example.news.dto.language.LanguageCreateDto;
import com.example.news.dto.language.LanguageDto;
import com.example.news.dto.language.LanguageUpdateDto;
import com.example.news.services.language.LanguageService;
import com.example.news.services.language.LanguageServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.news.controller.AbstractController.PATH;

@RestController
@RequestMapping(PATH + "/language")
public class LanguageController extends AbstractController<
        LanguageServiceImpl,
        LanguageDto,
        LanguageCreateDto,
        LanguageUpdateDto,
        String,
        LanguageCriteria> {
    public LanguageController(LanguageServiceImpl service) {
        super(service);
    }

    @Override
    @PostMapping("/create")
    protected ResponseEntity<DataDto<String>> create(@RequestBody LanguageCreateDto dto) {
        return new ResponseEntity<>(new DataDto<>(service.create(dto)), HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    protected ResponseEntity<DataDto<String>> delete(@PathVariable String id) {
        service.delete(id);

        return new ResponseEntity<>(new DataDto<>("deleted"), HttpStatus.OK);
    }

    @Override
    @PutMapping("/update/{id}")
    protected ResponseEntity<DataDto<String>> update(@RequestBody LanguageUpdateDto dto, @PathVariable String id) {
        dto.setId(id);
        service.update(dto);

        return new ResponseEntity<>(new DataDto<>("updated"), HttpStatus.OK);
    }

    @Override
    @GetMapping("/get/{id}")
    protected ResponseEntity<DataDto<LanguageDto>> get(@PathVariable String id) {
        return new ResponseEntity<>(new DataDto<>(service.get(id)), HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    protected ResponseEntity<DataDto<List<LanguageDto>>> getAll(LanguageCriteria criteria) {
        return new ResponseEntity<>(new DataDto<>(service.getAll(criteria)), HttpStatus.OK);
    }
}
