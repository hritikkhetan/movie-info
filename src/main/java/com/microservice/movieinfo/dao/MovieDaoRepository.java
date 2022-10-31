package com.microservice.movieinfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.movieinfo.model.Movie;

public interface MovieDaoRepository extends JpaRepository<Movie, Long>{

	Movie findByMovieId(String movieId);

}