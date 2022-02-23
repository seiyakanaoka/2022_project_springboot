package com.example.application2022.repository;

import com.example.application2022.entity.QualEntity;
import org.hibernate.loader.hql.QueryLoader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualRepository extends JpaRepository<QualEntity, Long> {
}
