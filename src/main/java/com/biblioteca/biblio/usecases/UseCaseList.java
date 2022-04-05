package com.biblioteca.biblio.usecases;

import com.biblioteca.biblio.DTO.BiblioDTO;
import com.biblioteca.biblio.mappers.BiblioMapper;
import com.biblioteca.biblio.respositories.BiblioRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@Service
@Validated
public class UseCaseList implements Supplier<Flux<BiblioDTO>> {
    private final BiblioRepository biblioRepository;
    private final BiblioMapper biblioMapper;
    public UseCaseList(BiblioMapper biblioMapper, BiblioRepository biblioRepository) {
        this.biblioRepository = biblioRepository;
        this.biblioMapper = biblioMapper;
    }

    @Override
    public Flux<BiblioDTO> get() {
        return biblioRepository.findAll().map(biblioMapper.toDto());
    }
}