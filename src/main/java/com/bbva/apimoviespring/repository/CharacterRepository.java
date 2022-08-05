package com.bbva.apimoviespring.repository;

import com.bbva.apimoviespring.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;




@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

    List<Character> findCharactersByNameContaining(String name);

    List<Character> findCharactersByNameContainingAndAgeEqualsAndMoviesContaining(String name, Integer age, Movie movie);


    List<Character> findCharactersByNameContainingAndAgeEquals(String name, Integer age);

    List<Character> findCharactersByAgeEquals(Integer age);

    List<Character> findCharactersByNameContainingAndMoviesContaining(String name, Movie movie);

    List<Character> findCharactersByAgeEqualsAndMoviesContaining(Integer age, Movie movie);

    List<Character> findCharactersByMoviesContaining(Movie movie);

    List<Character> findCharactersByName(String name);

    List<Character> findCharactersByAge(Integer age);
}