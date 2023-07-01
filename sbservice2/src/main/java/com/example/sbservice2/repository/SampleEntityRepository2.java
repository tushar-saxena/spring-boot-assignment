package com.example.sbservice2.repository;

import com.example.sbservice2.entity.SampleEntity2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleEntityRepository2 extends JpaRepository<SampleEntity2, Long> {

}
