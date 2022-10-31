package com.microservice.movieinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.movieinfo.dao.MovieDaoRepository;
import com.microservice.movieinfo.model.Movie;
import com.microservice.movieinfo.wrapper.CreateMovieRequest;

@RestController
public class MovieInfoController {
	
	@Autowired
	private MovieDaoRepository movieDaoRepository;

	@PostMapping(value = "/movie")
	public Movie createMovie(@RequestBody CreateMovieRequest createMovieRequest) {
		
		Movie movie = new Movie();
		movie.setMovieId(createMovieRequest.getMovieId());
		movie.setMovie(createMovieRequest.getMovie());
		movie.setDescription(createMovieRequest.getDesc());
		movieDaoRepository.save(movie);
		
		return movie;
	}
	
	@GetMapping(value = "/movie/{movieId}")
	public Movie getMovie(@PathVariable String movieId) {
		
		return movieDaoRepository.findByMovieId(movieId);
		
	}
}