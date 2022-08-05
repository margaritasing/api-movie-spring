package com.bbva.apimoviespring.dto;

import com.bbva.apimoviespring.entity.Character;
import com.bbva.apimoviespring.entity.Genre;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieDTO {

    private Long movie_id;
    private String title;
    private String image_url;
    private Long year;
    private Long score;




}

