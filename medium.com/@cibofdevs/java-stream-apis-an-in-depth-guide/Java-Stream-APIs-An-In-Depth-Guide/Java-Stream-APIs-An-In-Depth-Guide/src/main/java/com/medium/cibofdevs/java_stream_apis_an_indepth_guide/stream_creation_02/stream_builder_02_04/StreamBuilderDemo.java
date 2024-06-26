package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_creation_02.stream_builder_02_04;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamBuilderDemo {
  private static final Logger LOGGER =
    Logger.getLogger(StreamBuilderDemo.class.getName());
  public static void main(String... args) {
      Stream<String> streamBuiltFromStrings =
        Stream.<String>builder().add("Guido").add("Van").add("Rossum").build();
      streamBuiltFromStrings.forEach(
        element -> LOGGER.info(
          String.format(
            "Element: '%s'\n",
            element
          )
        )
      );
    return;
  }
}