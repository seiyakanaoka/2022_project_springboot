package com.example.application2022.service;

import com.example.application2022.entity.QualEntity;
import com.example.application2022.repository.QualRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QualService {
    private final QualRepository qualRepository;

    public QualService(QualRepository qualRepository) {
        this.qualRepository = qualRepository;
    }

    public List<QualEntity> getQualList() {
        return qualRepository.findAll();
    }

    public QualEntity getQual(long id) {
        return qualRepository.findById(id).orElseThrow();
    }

    public QualEntity postQual(QualEntity qual) {
        QualEntity newQual = new QualEntity();
        qual.setId(qual.getId());
        qual.setTitle(qual.getTitle());
        return qualRepository.save(qual);
    }
}
