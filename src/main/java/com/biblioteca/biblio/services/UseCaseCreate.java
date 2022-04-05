package com.biblioteca.biblio.services;

import com.biblioteca.biblio.DTO.BiblioDTO;
import com.biblioteca.biblio.collections.BiblioModel;
import com.biblioteca.biblio.mappers.BiblioMapper;
import com.biblioteca.biblio.respositories.BiblioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseCreate implements saveBiblio {
    private final BiblioRepository biblioRepository;
    private final BiblioMapper biblioMapper;

    @Autowired
    public UseCaseCreate(BiblioRepository biblioRepository, BiblioMapper biblioMapper) {

        this.biblioRepository = biblioRepository;
        this.biblioMapper = biblioMapper;
    }


    @Override
    public Mono<String> apply(BiblioDTO biblioDTO) {
        return biblioRepository.save(biblioMapper.fromDto(null).apply(biblioDTO)).map(BiblioModel::getId);
    }
}

//    @Override
//    public Mono<String> apply(BiblioDTO biblioDTO){
//    return biblioRepository.save(biblioMapper.fromCollectionList(null).apply(biblioDTO)).map(BiblioModel::getId);
//    }

