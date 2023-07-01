package com.example.sbservice1.config;

import com.example.sbservice1.entity.SampleEntity1;
import com.example.sbservice1.repository.SampleEntityRepository1;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleDataLoader1 implements ApplicationRunner {
    private final SampleEntityRepository1 sampleEntityRepository1;

    public SampleDataLoader1(SampleEntityRepository1 sampleEntityRepository) {
        this.sampleEntityRepository1 = sampleEntityRepository;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Create and save sample entities
        SampleEntity1 entity1 = new SampleEntity1();
        entity1.setName("John Doe");
        entity1.setAge(25);
        sampleEntityRepository1.save(entity1);

        SampleEntity1 entity2 = new SampleEntity1();
        entity2.setName("John Smith");
        entity2.setAge(30);
        sampleEntityRepository1.save(entity2);

        // You can create and save more sample entities as needed

        System.out.println("Sample data created successfully!");
    }
}
