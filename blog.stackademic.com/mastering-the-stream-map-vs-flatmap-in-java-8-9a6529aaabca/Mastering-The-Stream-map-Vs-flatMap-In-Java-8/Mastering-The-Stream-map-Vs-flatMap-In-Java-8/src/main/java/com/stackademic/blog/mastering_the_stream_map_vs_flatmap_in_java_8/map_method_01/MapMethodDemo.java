package com.stackademic.blog.mastering_the_stream_map_vs_flatmap_in_java_8.map_method_01;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class MapMethodDemo {
  private static final Logger LOGGER =
    Logger.getLogger(MapMethodDemo.class.getName());
  // Java program execution starts from
  // built-in `main()' method
  static public void main(String... args) {
      Stream.<String>of(
        "Java",
        "Streams",
        "API"
      ).<String>map(
        String::toUpperCase
      ).<String>forEach(
        upperCasedString -> LOGGER.info(
          String.format(
            "Upper-cased string is: '%s'\n",
            upperCasedString
          )
        )
      );
    return;
  }
}