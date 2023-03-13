package com.example.news.controller.publication;

import com.example.news.controller.AbstractController;
import com.example.news.criteria.publication.PublicationCriteria;
import com.example.news.dto.data.DataDto;
import com.example.news.dto.publication.PublicationCreateDto;
import com.example.news.dto.publication.PublicationDto;
import com.example.news.dto.publication.PublicationUpdateDto;
import com.example.news.services.publication.PublicationServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    protected ResponseEntity<DataDto<String>> create(PublicationCreateDto dto) {
        return null;
    }

    @Override
    protected ResponseEntity<DataDto<String>> delete(String entityId) {
        return null;
    }

    @Override
    protected ResponseEntity<DataDto<String>> update(PublicationUpdateDto dto, String entityId) {
        return null;
    }

    @Override
    protected ResponseEntity<DataDto<PublicationDto>> get(String entityId) {
        return null;
    }

    @Override
    protected ResponseEntity<DataDto<List<PublicationDto>>> getAll(PublicationCriteria criteria) {
        return null;
    }
}
