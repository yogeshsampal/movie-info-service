package com.test.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.models.Movie;

@RestController
public class MovieResource {

	@GetMapping("/movie/{movieId}")
	public ResponseEntity<Movie> getMovie(@PathVariable String movieId) {
		Movie movie = new Movie();
		movie.setMovieId(Integer.valueOf(movieId));
		movie.setMovieName("The Godfather");	
		return ResponseEntity.ok().body(movie);
	}
	
}
