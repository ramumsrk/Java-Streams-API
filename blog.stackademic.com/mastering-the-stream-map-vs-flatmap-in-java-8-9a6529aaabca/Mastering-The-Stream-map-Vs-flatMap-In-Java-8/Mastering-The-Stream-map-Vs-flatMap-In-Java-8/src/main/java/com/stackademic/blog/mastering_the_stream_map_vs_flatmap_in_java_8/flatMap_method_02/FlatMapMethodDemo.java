package com.stackademic.blog.mastering_the_stream_map_vs_flatmap_in_java_8.flatMap_method_02;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class FlatMapMethodDemo {
  private static final Logger LOGGER =
    Logger.getLogger(FlatMapMethodDemo.class.getName());
  // Java program execution starts from
  // built-in `main()' method
  public static void main(String... args) {
      Stream.<List<Integer>>of(
        List.of(
          1,
          2
        ),
        List.of(
          3,
          4
        ),
        List.of(
          5,
          6
        )
      ).flatMap(List::stream).forEach(
        integer -> LOGGER.info(
          String.format(
            "Number is: '%d'\n",
            integer
          )
        )
      );
    return;
  }
}