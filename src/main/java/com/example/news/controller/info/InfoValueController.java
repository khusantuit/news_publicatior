package com.example.news.controller.info;

import com.example.news.controller.AbstractController;
import com.example.news.controller.BaseController;
import com.example.news.criteria.info.InfoValueCriteria;
import com.example.news.dto.data.DataDto;
import com.example.news.dto.info.InfoUpdateDto;
import com.example.news.dto.info.InfoValueCreateDto;
import com.example.news.dto.info.InfoValueDto;
import com.example.news.dto.info.InfoValueUpdateDto;
import com.example.news.services.info.InfoValueService;
import com.example.news.services.info.InfoValueServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.news.controller.AbstractController.PATH;

@RestController
@RequestMapping(PATH + "/value")
public class InfoValueController extends AbstractController<
        InfoValueServiceImpl,
        InfoValueDto,
        InfoValueCreateDto,
        InfoValueUpdateDto,
        String,
        InfoValueCriteria> {
    public InfoValueController(InfoValueServiceImpl service) {
        super(service);
    }

    @Override
    @PostMapping("/create")
    protected ResponseEntity<DataDto<String>> create(@RequestBody InfoValueCreateDto dto) {
        return new ResponseEntity<>(new DataDto<>(service.create(dto)), HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    protected ResponseEntity<DataDto<String>> delete(String id) {
        service.delete(id);
        return new ResponseEntity<>(new DataDto<>("deleted"), HttpStatus.OK);
    }

    @Override
    @PutMapping("/update/{id}")
    protected ResponseEntity<DataDto<String>> update(InfoValueUpdateDto dto, String id) {
        dto.setId(id);
        service.update(dto);

        return new ResponseEntity<>(new DataDto<>("updated"), HttpStatus.OK);
    }

    @Override
    protected ResponseEntity<DataDto<InfoValueDto>> get(String id) {
        return new ResponseEntity<>(new DataDto<>(service.get(id)), HttpStatus.OK);
    }

    @Override
    protected ResponseEntity<DataDto<List<InfoValueDto>>> getAll(InfoValueCriteria criteria) {
        return new ResponseEntity<>(new DataDto<>(service.getAll(criteria)), HttpStatus.OK);
    }
}
