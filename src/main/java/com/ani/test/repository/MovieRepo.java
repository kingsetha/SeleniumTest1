package com.ani.test.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ani.test.model.Movie;


@Repository
public interface MovieRepo{
	public String save(Movie pay);
	public List<Movie> findAll();
	public Movie findById(int id);
	public String updateMovie(Movie pay);
	public String deleteMovie(int id);
	@Query("select pid from Movie")
	public List<Integer> getIdList();
}


