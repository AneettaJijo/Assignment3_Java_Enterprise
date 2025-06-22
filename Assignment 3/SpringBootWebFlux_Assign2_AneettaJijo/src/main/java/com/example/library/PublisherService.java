package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepo;

    public Flux<Publisher> getAll() {
        return publisherRepo.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Publisher> getById(final String id) {
        return publisherRepo.findById(id);
    }
    public Mono <Publisher>save(final Publisher publisher) {
        return publisherRepo.save(publisher);
    }
    
    public Mono update(final String id, final  Publisher publisher) {
        return publisherRepo.save(publisher);
    }

    public Mono deleteById(final String id) {
    	return publisherRepo.deleteById(id);
    }
}
