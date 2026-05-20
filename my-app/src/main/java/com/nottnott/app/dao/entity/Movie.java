package com.nottnott.app.dao.entity;

public record Movie(
    Long id,
    String title,
    String genre,
    Integer year) {
}
