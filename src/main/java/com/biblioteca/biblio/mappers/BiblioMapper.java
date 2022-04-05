package com.biblioteca.biblio.mappers;

import com.biblioteca.biblio.DTO.BiblioDTO;
import com.biblioteca.biblio.collections.BiblioModel;
import org.springframework.stereotype.Component;


import java.util.function.Function;

@Component
public class BiblioMapper {

    public Function<BiblioDTO, BiblioModel> fromDto(String id) {
        return updateBiblio-> {
            var biblioModel = new BiblioModel();
            biblioModel.setId(id);
            biblioModel.setName(updateBiblio.getName());
            biblioModel.setAutor(updateBiblio.getAutor());
            biblioModel.setLend(updateBiblio.getLend());
            biblioModel.setTheme(updateBiblio.getTheme());
            biblioModel.setTipe(updateBiblio.getTipe());
            biblioModel.setDate(updateBiblio.getDate());
            return biblioModel;
        };
    }

    public Function<BiblioModel, BiblioDTO> fromCollection() {
        return entity -> new BiblioDTO(entity.getId(),entity.getAutor(),entity.getTipe(),entity.getDate(),entity.getLend(), entity.getTheme(), entity.getName());
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