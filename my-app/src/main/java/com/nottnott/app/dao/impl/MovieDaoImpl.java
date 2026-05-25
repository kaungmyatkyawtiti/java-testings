package com.nottnott.app.dao.impl;

import java.sql.PreparedStatement;
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
      String sql = "SELECT * FROM movies;";
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        Long id = rs.getLong("ID");
        String title = rs.getString("title");
        String genre = rs.getString("genre");
        Integer year = rs.getInt("year");
        Movie movie = new Movie(id, title, genre, year);
        movies.add(movie);
      }
      rs.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return movies;
  }

  @Override
  public Movie getMovieById(String id) {
    Movie movie = null;
    String sql = "SELECT * FROM movies WHERE id=?;";
    try (PreparedStatement stmt = this.getConnnection().prepareStatement(sql)) {
      stmt.setString(1, id);

      ResultSet rs = stmt.executeQuery();
      while (rs.next()) {
        Long movieId = rs.getLong("ID");
        String title = rs.getString("title");
        String genre = rs.getString("genre");
        Integer year = rs.getInt("year");
        movie = new Movie(movieId, title, genre, year);
      }
      rs.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return movie;
  }

  @Override
  public boolean saveMovie(Movie movie) {
    String sql = "INSERT INTO movies(title, genre, year) VALUES(?, ?, ?);";

    try (PreparedStatement stmt = this.getConnnection().prepareStatement(sql)) {
      stmt.setString(1, movie.title());
      stmt.setString(2, movie.genre());
      stmt.setLong(3, movie.year());

      int row = stmt.executeUpdate();
      return row > 0;
    } catch (Exception e) {
      e.printStackTrace();
    }

    return false;
  }

  @Override
  public boolean updateMovie(String id, Movie movie) {
    String sql = "UPDATE movies SET title=?, genre=?, year=? WHERE id=?;";

    try (PreparedStatement stmt = this.getConnnection().prepareStatement(sql)) {
      stmt.setString(1, movie.title());
      stmt.setString(2, movie.genre());
      stmt.setLong(3, movie.year());

      stmt.setLong(4, Long.parseLong(id));
      int row = stmt.executeUpdate();
      return row > 0;
    } catch (Exception e) {
      e.printStackTrace();
    }

    return false;
  }

  @Override
  public boolean deleteMovie(String id) {
    String sql = "DELETE FROM movies WHERE id=?;";

    try (PreparedStatement stmt = this.getConnnection().prepareStatement(sql)) {
      stmt.setLong(1, Long.parseLong(id));
      int row = stmt.executeUpdate();
      return row > 0;
    } catch (Exception e) {
      e.printStackTrace();
    }

    return false;
  }

  public static void main(String[] args) {
    MovieDao movieDao = new MovieDaoImpl();

    Movie movie = movieDao.getMovieById("1");
    System.out.println("Movie id 1 " + movie);

    // Movie newMovie = new Movie(0L, "New Movie", "Horror", 2003);
    // movieDao.saveMovie(newMovie);

    // Movie updated = new Movie(0L, "Sing2", "Comedy", 2014);
    // movieDao.updateMovie("4", updated);

    movieDao.deleteMovie("5");

    List<Movie> movies = movieDao.getAllMovie();
    movies.forEach(System.out::println);
  }
}
