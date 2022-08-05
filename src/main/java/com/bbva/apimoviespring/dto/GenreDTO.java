package com.bbva.apimoviespring.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GenreDTO {
    private Long genre_id;
    private String name;
    private String image;

}

