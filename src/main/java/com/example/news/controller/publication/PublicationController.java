package com.example.news.controller.publication;

import com.example.news.controller.AbstractController;
import com.example.news.criteria.publication.PublicationCriteria;
import com.example.news.dto.data.DataDto;
import com.example.news.dto.publication.PublicationCreateDto;
import com.example.news.dto.publication.PublicationDto;
import com.example.news.dto.publication.PublicationUpdateDto;
import com.example.news.services.publication.PublicationServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.news.controller.AbstractController.PATH;

@RestController
@RequestMapping(PATH + "/publication")
public class PublicationController extends AbstractController<
        PublicationServiceImpl,
        PublicationDto,
        PublicationCreateDto,
        PublicationUpdateDto,
        String,
        PublicationCriteria
        > {
    public PublicationController(PublicationServiceImpl service) {
        super(service);
    }

    @Override
    @PostMapping("/create")
    protected ResponseEntity<DataDto<String>> create(@RequestBody PublicationCreateDto dto) {
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
    protected ResponseEntity<DataDto<String>> update(@RequestBody PublicationUpdateDto dto, @PathVariable("id") String entityId) {
        dto.setId(entityId);
        service.update(dto);

        return new ResponseEntity<>(new DataDto<>("updated"), HttpStatus.OK);
    }

    @Override
    @GetMapping("/get/{id}")
    protected ResponseEntity<DataDto<PublicationDto>> get(@PathVariable("id") String entityId) {
        return new ResponseEntity<>(new DataDto<>(service.get(entityId)), HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    protected ResponseEntity<DataDto<List<PublicationDto>>> getAll(PublicationCriteria criteria) {
        return new ResponseEntity<>(new DataDto<>(service.getAll(criteria)), HttpStatus.OK);
    }
}
