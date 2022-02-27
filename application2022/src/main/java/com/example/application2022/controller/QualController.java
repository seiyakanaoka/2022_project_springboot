package com.example.application2022.controller;

import com.example.application2022.entity.QualEntity;
import com.example.application2022.repository.QualRepository;
import com.example.application2022.service.QualService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/qual")
@RestController
@RequiredArgsConstructor
public class QualController {
    private final QualService qualService;

    @GetMapping
    public List<QualEntity> getQualList() {
        return qualService.getQualList();
    }

    @GetMapping("{id}")
    public QualEntity getQual(@PathVariable long id) {
        return qualService.getQual(id);
    }

    @PostMapping("/register")
    public QualEntity createQual(@RequestBody QualEntity qualEntity) {
        return qualService.postQual(qualEntity);
    }
}
