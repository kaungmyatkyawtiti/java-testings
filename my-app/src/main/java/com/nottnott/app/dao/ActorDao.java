package com.nottnott.app.dao;

import java.util.List;

import com.nottnott.app.dao.entity.Actor;

public interface ActorDao {
  List<Actor> getAllActorInMovie(Long movieId);
}
