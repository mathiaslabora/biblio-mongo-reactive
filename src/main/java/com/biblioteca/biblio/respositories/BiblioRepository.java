package com.biblioteca.biblio.respositories;


import com.biblioteca.biblio.collections.BiblioModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;
@Repository
public interface BiblioRepository extends ReactiveMongoRepository<BiblioModel, String> {
    /*Flux<BiblioModel> findByTheme(String theme);
    Flux<BiblioModel> findByTipe(String tipe);*/
}
