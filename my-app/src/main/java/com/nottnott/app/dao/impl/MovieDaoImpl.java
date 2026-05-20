package com.nottnott.app.dao.impl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nottnott.app.dao.BaseDao;
import com.nottnott.app.dao.MovieDao;
import com.nottnott.app.dao.entity.Movie;

public class MovieDaoImpl extends BaseDao implements MovieDao {
  @Override
  public List<Movie> getAllMovie() {
    List<Movie> movies = new ArrayList<>();

    try (Statement stmt = this.getConnnection().createStatement()) {
      String sql = "SELECT * FROM movies";
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        Long id = rs.getLong("ID");
        String title = rs.getString("title");
        String genre = rs.getString("genre");
        Integer year = rs.getInt("year");
        Movie movie = new Movie(id, title, genre, year);
        movies.add(movie);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return movies;
  }
}
