package com.microservice.movieinfo.wrapper;

import org.springframework.lang.NonNull;

import lombok.Data;

@Data
public class CreateMovieRequest {

	@NonNull
	private String movieId;
	
	@NonNull
	private String movie;
	
	@NonNull
	private String desc;
	
}