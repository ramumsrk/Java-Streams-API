package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_creation_02.stream_of_strings_02_08;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamOfStringsDemo {
  private static final Logger LOGGER =
    Logger.getLogger(StreamOfStringsDemo.class.getName());
  public static void main(String... args) {
      Stream<String> streamOfStrings = Stream.of(
        "James",
        "Gosling",
        "Guido",
        "Van",
        "Rossum"
      );
      streamOfStrings.forEach(
        string -> LOGGER.info(
          String.format(
            "String is: '%s'\n",
            string
          )
        )
      );
    return;
  }
}
