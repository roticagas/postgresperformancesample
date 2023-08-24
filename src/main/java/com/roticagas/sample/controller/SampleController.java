package com.roticagas.sample.controller;


import com.roticagas.sample.entity.SampleEntity;
import com.roticagas.sample.service.SampleService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SampleController {

    private final SampleService service;

    public SampleController(SampleService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    Mono<String> hello() {
        return Mono.just("hello");
    }

    @GetMapping("/sample")
    Flux<SampleEntity> findAll() {
        return service.findAll();
    }

    @GetMapping("/sample/{name}")
    Flux<SampleEntity> findByName(@PathVariable String name) {
        return service.findByName(name);
    }

    @PostMapping("/sample")
    Mono<SampleEntity> save(@RequestBody String name) {
        return service.save(name);
    }

}
