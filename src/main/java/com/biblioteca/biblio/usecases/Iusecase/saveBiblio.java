package com.biblioteca.biblio.usecases.Iusecase;

import com.biblioteca.biblio.DTO.BiblioDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface saveBiblio {
    public Mono<String> apply(BiblioDTO biblioDTO);
}
