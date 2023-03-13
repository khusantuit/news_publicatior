package com.example.news.controller.publication;

import com.example.news.controller.AbstractController;
import com.example.news.criteria.publication.paragraph.ParagraphCriteria;
import com.example.news.dto.data.DataDto;
import com.example.news.dto.publication.paragraph.ParagraphCreateDto;
import com.example.news.dto.publication.paragraph.ParagraphDto;
import com.example.news.dto.publication.paragraph.ParagraphUpdateDto;
import com.example.news.services.publication.ParagraphService;
import com.example.news.services.publication.ParagraphServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.news.controller.AbstractController.PATH;

@RestController
@RequestMapping(PATH + "/paragraph")
public class ParagraphController extends AbstractController<
        ParagraphServiceImpl,
        ParagraphDto,
        ParagraphCreateDto,
        ParagraphUpdateDto,
        String,
        ParagraphCriteria> {
    public ParagraphController(ParagraphServiceImpl service) {
        super(service);
    }

    @Override
    @PostMapping("/create")
    protected ResponseEntity<DataDto<String>> create(@RequestBody ParagraphCreateDto dto) {
        return new ResponseEntity<>(new DataDto<>(service.create(dto)), HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    protected ResponseEntity<DataDto<String>> delete(@PathVariable("id") String entityId) {
        service.delete(entityId);

        return new ResponseEntity<>(new DataDto<>("deleted"), HttpStatus.OK);
    }

    @Override
    @PutMapping("/update/{id}")
    protected ResponseEntity<DataDto<String>> update(@RequestBody ParagraphUpdateDto dto, @PathVariable("id") String entityId) {
        dto.setId(entityId);
        service.update(dto);

        return new ResponseEntity<>(new DataDto<>("updated"), HttpStatus.OK);
    }

    @Override
    @GetMapping("/get/{id}")
    protected ResponseEntity<DataDto<ParagraphDto>> get(@PathVariable("id") String entityId) {
        return new ResponseEntity<>(new DataDto<>(service.get(entityId)), HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    protected ResponseEntity<DataDto<List<ParagraphDto>>> getAll(ParagraphCriteria criteria) {
        return new ResponseEntity<>(new DataDto<>(service.getAll(criteria)), HttpStatus.OK);
    }
}
