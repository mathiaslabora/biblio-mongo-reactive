package com.biblioteca.biblio.usecases.Iusecase;

import com.biblioteca.biblio.DTO.BiblioDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface saveBiblio {
    Mono<BiblioDTO> apply(BiblioDTO biblioDTO);
}
