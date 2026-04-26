package com.nottnott.app.chapter12;

import java.lang.reflect.Field;

public class NotNullProcessor {
  public static void checkNull(Object obj) {
    Field[] fields = obj.getClass().getDeclaredFields();

    for (Field field : fields) {
      // System.out.println("fieldName " + field.getName());
      NotNull anno = field.getAnnotation(NotNull.class);
      if (anno != null) {
        // System.out.println("Field " + field.getName() + " have annotation");
        try {
          Object value = field.get(obj);
          if (value == null) {
            System.err.println(anno.message());
            // System.err.println("Field " + field.getName() + " is Null");
          }
        } catch (Exception e) {
        }
      }
    }
  }

  public static void main(String[] args) {
    Human h = new Human();
    Data d = new Data();
    checkNull(h);
    checkNull(d);
  }
}
