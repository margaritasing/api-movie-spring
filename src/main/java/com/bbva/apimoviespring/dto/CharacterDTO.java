package com.bbva.apimoviespring.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CharacterDTO {

    private Long character_id;
    private String imagen;
    private String nombre;
    private String edad;
    private String peso;
    private String historia;






}
