package com.nottnott.app.dao.impl;

import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.nottnott.app.dao.ActorDao;
import com.nottnott.app.dao.BaseDao;
import com.nottnott.app.dao.entity.Actor;

public class ActorDaoImpl extends BaseDao implements ActorDao {
  @Override
  public List<Actor> getAllActorInMovie(Long movieId) {
    String sql = "SELECT actor.* FROM movie_actor, actors "
        + "WHERE movie_id=? "
        + "AND movie_actor.actor_id=actors.id";
    List<Actor> actors = new ArrayList<>();

    try (PreparedStatement stmt = this.getConnnection().prepareStatement(sql)) {
      stmt.setLong(1, movieId);

      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        Long actorId = rs.getLong("ID");
        String name = rs.getString("name");
        String gender = rs.getString("genre");
        Date birthday = rs.getDate("birthday");
        Actor actor = new Actor(actorId, name, gender, birthday);
        actors.add(actor);
      }
      rs.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return actors;
  }

  public static void main(String[] args) {
    ActorDao actorDao = new ActorDaoImpl();
    List<Actor> actors = actorDao.getAllActorInMovie(1L);
  }
}
