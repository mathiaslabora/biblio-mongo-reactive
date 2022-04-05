package com.biblioteca.biblio.router;

import com.biblioteca.biblio.DTO.BiblioDTO;
import com.biblioteca.biblio.usecases.UseCaseCreate;
import com.biblioteca.biblio.usecases.UseCaseList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterBiblio {

    @Bean
    public RouterFunction<ServerResponse> getAll(UseCaseList useCaseList){
        return route(
                GET("/consultar").and(accept(MediaType.APPLICATION_JSON)),
                                request->ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                .body(BodyInserters.fromPublisher(useCaseList.get(), BiblioDTO.class))
                );
    }

    @Bean
    public org.springframework.web.servlet.function.RouterFunction<org.springframework.web.servlet.function.ServerResponse> createBiblio(UseCaseCreate useCaseCreate) {
        return null;
    }
}
