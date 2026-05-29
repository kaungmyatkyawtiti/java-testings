package com.nottnott.app.dao.entity;

import java.util.Date;

// enum Gender {
//   MALE,
//   FEMALE,
// }

public record Actor(
    Long id,
    String name,
    String gender,
    Date bithday) {
}
