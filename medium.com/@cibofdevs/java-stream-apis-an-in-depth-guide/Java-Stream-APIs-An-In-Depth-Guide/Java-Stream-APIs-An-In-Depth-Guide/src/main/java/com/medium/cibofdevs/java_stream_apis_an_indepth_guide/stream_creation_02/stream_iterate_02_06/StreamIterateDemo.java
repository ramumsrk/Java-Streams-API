package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_creation_02.stream_iterate_02_06;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamIterateDemo {
  private static final Logger LOGGER =
    Logger.getLogger(StreamIterateDemo.class.getName());
  public static void main(String... args) {
      Stream<Integer> integerStreamToIterate = Stream.<Integer>iterate(0,
        number -> number + 1).limit(3);
      integerStreamToIterate.forEach(
        number -> LOGGER.info(
          String.format(
            "Number in stream: '%d'\n",
            number
          )
        )
      );
    return;
  }
}
