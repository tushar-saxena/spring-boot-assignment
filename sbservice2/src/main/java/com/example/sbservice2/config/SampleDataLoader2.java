package com.example.sbservice2.config;

import com.example.sbservice2.entity.SampleEntity2;
import com.example.sbservice2.repository.SampleEntityRepository2;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleDataLoader2 implements ApplicationRunner {
    private final SampleEntityRepository2 sampleEntityRepository;

    public SampleDataLoader2(SampleEntityRepository2 sampleEntityRepository) {
        this.sampleEntityRepository = sampleEntityRepository;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Create and save sample entities
        SampleEntity2 entity1 = new SampleEntity2();
        entity1.setName("John Doe");
        entity1.setAge(25);
        sampleEntityRepository.save(entity1);

        SampleEntity2 entity2 = new SampleEntity2();
        entity2.setName("John Smith");
        entity2.setAge(30);
        sampleEntityRepository.save(entity2);

        // You can create and save more sample entities as needed

        System.out.println("Sample data created successfully!");
    }
}
