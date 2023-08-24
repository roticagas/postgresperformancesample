package com.roticagas.sample.repository;


import com.roticagas.sample.entity.SampleEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface SampleRepository extends ReactiveCrudRepository<SampleEntity, Long> {

    Flux<SampleEntity> findAllByNameContainingIgnoreCase(String name);

}
