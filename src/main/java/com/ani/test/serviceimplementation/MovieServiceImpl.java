package com.ani.test.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ani.test.model.Movie;
import com.ani.test.repository.MovieRepo;
import com.ani.test.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	MovieRepo repo;

	public MovieServiceImpl(MovieRepo repo) {
		super();
		this.repo = repo;
	}
	@Override
	public String addMovie(Movie Movie) {
		return repo.save(Movie);

	}
	@Override
	public Movie getMovie(int id) {
//		Optional<Movie> MovieOptional = repo.findById(id);
		return repo.findById(id);

	}
	@Override
	public List<Movie> getAllMovies() {

		return repo.findAll();
	}
	@Override
	public String updateMovie(Movie Movie) {
		return repo.updateMovie(Movie);

	}
	@Override
	public String deleteMovie(int id) {
		return repo.deleteMovie(id);

	}

}
