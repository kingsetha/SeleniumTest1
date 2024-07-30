package com.ani.test.service;

import java.util.List;

import com.ani.test.model.Movie;

public interface MovieService {

	public String addMovie(Movie Movie);

	public Movie getMovie(int id);

	public List<Movie> getAllMovies();

	public String updateMovie(Movie Movie);

	public String deleteMovie(int id);
}
