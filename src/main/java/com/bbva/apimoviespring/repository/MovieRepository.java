package com.bbva.apimoviespring.repository;

import com.bbva.apimoviespring.entity.Genre;
import com.bbva.apimoviespring.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {





}
