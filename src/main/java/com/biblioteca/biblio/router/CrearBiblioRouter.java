package com.biblioteca.biblio.router;

import com.biblioteca.biblio.services.UseCaseCreate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class CrearBiblioRouter {
    @Bean
    public RouterFunction<ServerResponse> createBiblio(UseCaseCreate useCaseCreate) {
        return null;
    }
}
