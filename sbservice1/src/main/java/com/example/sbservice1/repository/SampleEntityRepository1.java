package com.example.sbservice1.repository;

import com.example.sbservice1.entity.SampleEntity1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleEntityRepository1 extends JpaRepository<SampleEntity1, Long> {

}
