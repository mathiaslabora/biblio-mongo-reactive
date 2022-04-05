package com.biblioteca.biblio.DTO;

import lombok.Data;

import org.springframework.data.annotation.Id;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class BiblioDTO {
        @Id
        private String id = UUID.randomUUID().toString();

        private String name;

        private String autor;

        private String tipe;

        private LocalDate date;

        private String theme;

        private Boolean isLend;

    public BiblioDTO(String id, String autor, String tipe, LocalDate date, Boolean lend, String theme, String name) {
    }

    public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getTipe() {
            return tipe;
        }

        public void setTipe(String tipe) {
            this.tipe = tipe;
        }

        public String getTheme() {
            return theme;
        }

        public void setTheme(String theme) {
            this.theme = theme;
        }

        public Boolean getLend() {
            return isLend;
        }

        public void setLend(Boolean lend) {
            isLend = lend;
        }
    }

