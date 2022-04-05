package com.biblioteca.biblio.mappers;

import com.biblioteca.biblio.DTO.BiblioDTO;
import com.biblioteca.biblio.collections.BiblioModel;
import org.springframework.stereotype.Component;


import java.util.function.Function;

@Component
public class BiblioMapper {

    public Function<BiblioDTO, BiblioModel> toBiblio() {
        return biblioModel -> {
            return new BiblioModel(biblioModel.getId(),
                    biblioModel.getName(),
                    biblioModel.getAutor(),
                    biblioModel.getLend(),
                    biblioModel.getTheme(),
                    biblioModel.getTipe(),
                    biblioModel.getDate());

        };
    }

    public Function<BiblioModel, BiblioDTO> toDto() {
        return entity -> new BiblioDTO(entity.getId(), entity.getAutor(), entity.getTipe(), entity.getDate(), entity.getLend(), entity.getTheme(), entity.getName());
    }

//devuelve de lista de modelos a listado dto:
    /*public List<BiblioDTO> fromCollectionList(List<BiblioModel> collection) {
        if (collection == null) {
            return null;
        }
        List<BiblioDTO> list = new ArrayList(collection.size());
        Iterator listTracks = collection.iterator();

        while (listTracks.hasNext()) {
            BiblioModel biblioModel = (BiblioModel) listTracks.next();
            list.add(fromCollection(biblioModel));
        }
        return list;
    }*/


}