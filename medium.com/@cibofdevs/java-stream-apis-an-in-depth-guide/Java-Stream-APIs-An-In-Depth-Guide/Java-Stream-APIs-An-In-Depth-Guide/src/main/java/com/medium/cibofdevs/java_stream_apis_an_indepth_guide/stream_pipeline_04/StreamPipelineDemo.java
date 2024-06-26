package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_pipeline_04;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamPipelineDemo {
  private static final Logger LOGGER =
    Logger.getLogger(StreamPipelineDemo.class.getName());
  public static void main(String... args) {
      Stream.of(
        "James",
        "Gosling",
        "Guido",
        "Van",
        "Rossum"
      ).map(
        String::toUpperCase
      ).sorted().forEach(
        upperCasedString -> LOGGER.info(
          String.format(
            "String literal is: '%s'\n",
            upperCasedString
          )
        )
      );
    return;
  }
}
