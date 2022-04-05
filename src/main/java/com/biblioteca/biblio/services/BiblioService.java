package com.biblioteca.biblio.services;


import com.biblioteca.biblio.DTO.BiblioDTO;
import com.biblioteca.biblio.mappers.BiblioMapper;
import com.biblioteca.biblio.collections.BiblioModel;
import com.biblioteca.biblio.respositories.BiblioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.List;

@Service
public class BiblioService {

    @Autowired
    BiblioRepository biblioRepository;
    BiblioMapper mapper = new BiblioMapper();

    //crud
    public Flux<BiblioModel> getRecursos() {
        return biblioRepository.findAll();
    }

    public Mono<BiblioModel> create(BiblioModel biblioModel) {
        return biblioRepository.save(biblioModel);
    }
    public Mono<BiblioModel> getById(String id) {
        return biblioRepository.findById(id);
           }

    /*public BiblioDTO edit(BiblioDTO biblioDTO) {
        BiblioModel biblioModel = mapper.fromDto(biblioDTO);
        biblioRepository.findById(biblioModel.getId()).orElseThrow(() -> new RuntimeException("recurso no encontrado"));
        return mapper.fromCollection(biblioRepository.save(biblioModel));
    }

    public void delete(String id) {
        biblioRepository.deleteById(id);
    }



    //consultar disponibilidad:
    public BiblioDTO availability(String id) {
        BiblioModel biblioModel = biblioRepository.findById(id).orElseThrow(() -> new RuntimeException("recurso no disponible"));
        if (biblioModel.getLend() == false) {
            System.out.println("Se encuentra disponible!!");
            return mapper.fromCollection(biblioModel);
        }
        System.out.println("Se encuentra en prestamo desde: " + biblioModel.getDate());
        return mapper.fromCollection(biblioModel);
    }


    //prestar:
    public BiblioDTO lend(String id) {
        BiblioModel biblioModel = biblioRepository.findById(id).orElseThrow(() -> new RuntimeException("recurso no disponible"));
        if (biblioModel.getLend() == false) {
            biblioModel.setLend(true);
            biblioModel.setDate(LocalDate.now());
        } else {
            System.out.println("Ya se encuentra prestado");
        }
        return mapper.fromCollection(biblioRepository.save(biblioModel));
    }

    //devolver:
    public BiblioDTO giveback(String id) {
        BiblioModel biblioModel = biblioRepository.findById(id).orElseThrow(() -> new RuntimeException("recurso no disponible"));
        if (biblioModel.getLend() == true) {
            biblioModel.setLend(false);
        } else {
            System.out.println("No se encuentra en prestamo, no puede ser devuelto!!");
        }
        return mapper.fromCollection(biblioRepository.save(biblioModel));
    }


    //recomendar
    public List<BiblioDTO> recommendtheme(String theme) {
        List<BiblioModel> biblioModel = biblioRepository.findByTheme(theme);
        return mapper.fromCollectionList(biblioModel);
    }

    public List<BiblioDTO> recommendtipe(String tipe) {
        List<BiblioModel> biblioModel = biblioRepository.findByTipe(tipe);
        return mapper.fromCollectionList(biblioModel);
    }

    public List<BiblioDTO> recommendtipeandtheme(String tipe, String theme) {
        List<BiblioModel> biblioModel = biblioRepository.findByTipe(tipe);
        biblioModel.stream().filter(x->x.getTheme().equals(theme));
        return mapper.fromCollectionList(biblioModel);
    }
*/
}
