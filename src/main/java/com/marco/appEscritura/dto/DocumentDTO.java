package com.marco.appEscritura.dto;

import com.marco.appEscritura.entity.Document;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
public class DocumentDTO {

    long id;
    String tittle;
    String cover;
    String privateText;

    String creatorUsername;
    String synopsis;
    List<String> genres;

    public DocumentDTO() {
        this.privateText = "";
        genres = new ArrayList<>();
    }
    public DocumentDTO(long id, String privateText) {
        this.id = id;
        this.privateText = privateText;
    }

    public DocumentDTO(long id, String tittle, String cover, String privateText, String creatorUsername, String synopsis, List<String> genres) {
        System.out.println(genres);
        this.id = id;
        this.tittle = tittle;
        this.cover = cover;
        this.privateText = privateText;
        this.creatorUsername = creatorUsername;
        this.synopsis = synopsis;
        this.genres = genres;
    }
}
