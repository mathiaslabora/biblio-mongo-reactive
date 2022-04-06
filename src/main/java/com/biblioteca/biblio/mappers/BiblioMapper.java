package com.biblioteca.biblio.mappers;

import com.biblioteca.biblio.DTO.BiblioDTO;
import com.biblioteca.biblio.collections.BiblioModel;
import org.springframework.stereotype.Component;


import java.util.function.Function;

@Component
public class BiblioMapper {

    public Function<BiblioDTO, BiblioModel> toBiblio(String id) {
        return updateBiblio -> {
            var biblio = new BiblioModel();
            biblio.setId(id);
            biblio.setName(updateBiblio.getName());
            biblio.setAutor(updateBiblio.getAutor());
            biblio.setLend(updateBiblio.getLend());
            biblio.setTheme(updateBiblio.getTheme());
            biblio.setTipe(updateBiblio.getTipe());
            biblio.setDate(updateBiblio.getDate());

            return biblio;
        };
    }

    public Function<BiblioModel, BiblioDTO> toDto() {
        return entity -> new BiblioDTO(entity.getId(), entity.getAutor(), entity.getTipe(), entity.getDate(), entity.getLend(), entity.getTheme(), entity.getName());
    }


}