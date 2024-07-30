package com.ani.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.ani.test.model.Movie;
import com.ani.test.serviceimplementation.MovieServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/Movie")
@CrossOrigin("http://localhost:3000")
public class MovieController {

	
	MovieServiceImpl service;
	
	public MovieController(MovieServiceImpl service) {
		super();
		this.service = service;
	}
	static final String SUCCESS = "success";
	static final String FAILURE = "failure";
	@PostMapping
	public String insertMovie(@RequestBody Movie rep) {
		String msg = "";
		try {
			service.addMovie(rep);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}
	@GetMapping("{id}")
	public Movie getMovieById(@PathVariable("id") int id)
	{
		return service.getMovie(id);
	}
	@GetMapping("/all")
	public List<Movie> getMovies()
	{
		return service.getAllMovies();
	}

	@PutMapping
	public String updateMovie(@RequestBody Movie rep) {
		String msg = "";
		try {
			service.updateMovie(rep);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}
	@DeleteMapping("{id}")
	public String deleteMovieById(@PathVariable("id") int id)
	{
		String msg = "";
		try {
			service.deleteMovie(id);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}

}
