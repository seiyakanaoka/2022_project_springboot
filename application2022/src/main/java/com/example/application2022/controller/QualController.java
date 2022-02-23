package com.example.application2022.controller;

import com.example.application2022.entity.QualEntity;
import com.example.application2022.repository.QualRepository;
import com.example.application2022.service.QualService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QualController {
    private final QualService qualService;
    public QualController(QualService qualService) {
        this.qualService = qualService;
    }

    @RequestMapping(value = "/api/quals", method = RequestMethod.GET)
    public List<QualEntity> getQualualList() {
        return qualService.getQualList();
    }
}
