package com.nottnott.app.dao;

import java.util.List;

import com.nottnott.app.dao.entity.Movie;

public interface MovieDao {
  List<Movie> getAllMovie();

  Movie getMovieById(String id);

  boolean saveMovie(Movie movie);

  boolean updateMovie(String id, Movie movie);

  boolean deleteMovie(String id);
}
