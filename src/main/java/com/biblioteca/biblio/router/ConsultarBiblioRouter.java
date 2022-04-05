package com.biblioteca.biblio.router;

import com.biblioteca.biblio.DTO.BiblioDTO;
import com.biblioteca.biblio.services.BiblioService;
import com.biblioteca.biblio.services.UseCaseList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.awt.*;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class ConsultarBiblioRouter {

    @Bean
    public RouterFunction<ServerResponse> getall(UseCaseList useCaseList){
        return route(
                GET("/consultar").and(accept(MediaType.APPLICATION_JSON)),
                                request->ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                .body(BodyInserters.fromPublisher(useCaseList.get(), BiblioDTO.class))
                );
    }
}
