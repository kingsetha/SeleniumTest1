package com.ani.test.repoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ani.test.model.Customer;
import com.ani.test.model.Movie;
import com.ani.test.repository.MovieRepo;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.persistence.EntityManager;
@Transactional
@Repository
public class MovieRepoImpl implements MovieRepo{

	@Autowired
	EntityManager em;
	@Override
	public String save(Movie Movie) {
		if(Movie!=null)
		{
			em.merge(Movie);
			return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public List<Movie> findAll() {
		String hql = "from Movie";
		Query query = em.createQuery(hql);
		return query.getResultList();
		
	}

	@Override
	public Movie findById(int id) {
		return em.find(Movie.class, id);
	}

	@Override
	public String updateMovie(Movie Movie) {
		if(Movie!=null)
		{
			em.merge(Movie);
			return "success";
		}
		else {
			return "failure";
		}
		
	}

	@Override
	public String deleteMovie(int id) {
//		Movie e=em.find(Movie.class,id);
//		em.remove(e);
//		Optional<Movie> studentOptional= Optional.empty();
//		if(studentOptional.isPresent())
//		{
//			em.remove(studentOptional);
//			return "success";
//		}
//		else {
//			return "failure";
//		}
		Movie e=em.find(Movie.class,id);
		if(e!=null)
		{
			em.remove(e);
			return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public List<Integer> getIdList() {
		return null;
	}

}
