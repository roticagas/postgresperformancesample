package com.roticagas.sample.service;

import com.roticagas.sample.entity.SampleEntity;
import com.roticagas.sample.repository.SampleRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SampleService {

    private final SampleRepository repository;

    public SampleService(SampleRepository repository) {
        this.repository = repository;
    }

    public Flux<SampleEntity> findAll() {
        return repository.findAll();
    }

    public Flux<SampleEntity> findByName(String name) {
        return repository.findAllByNameContainingIgnoreCase(name);
    }

    public Mono<SampleEntity> save(String name) {
        return repository.save(SampleEntity.build(name));
    }

    public Mono<Long> count() {
        return repository.count();
    }
}
