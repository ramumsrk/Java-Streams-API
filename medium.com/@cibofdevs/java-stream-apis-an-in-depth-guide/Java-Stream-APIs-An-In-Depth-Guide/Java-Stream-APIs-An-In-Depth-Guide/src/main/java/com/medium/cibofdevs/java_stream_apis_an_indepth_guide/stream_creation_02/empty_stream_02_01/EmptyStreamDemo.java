package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_creation_02.empty_stream_02_01;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class EmptyStreamDemo {
  private static final Logger LOGGER =
    Logger.getLogger(EmptyStreamDemo.class.getName());
  static public void main(String... args) {
      Stream<String> emptyStreamOfStrings = Stream.empty();
      LOGGER.info(
        String.format(
          "Number of elements in stream is: '%d'\n",
          emptyStreamOfStrings.count()
        )
      );
    return;
  }
}
