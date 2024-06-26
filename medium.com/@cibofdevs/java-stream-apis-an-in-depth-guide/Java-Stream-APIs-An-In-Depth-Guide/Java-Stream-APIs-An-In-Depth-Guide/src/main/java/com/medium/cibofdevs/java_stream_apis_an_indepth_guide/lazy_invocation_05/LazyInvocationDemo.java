package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.lazy_invocation_05;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class LazyInvocationDemo {
  private static final Logger LOGGER =
    Logger.getLogger(LazyInvocationDemo.class.getName());
  static public void main(String... args) {
      List<String> listOfStrings = List.of(
        "James",
        "Gosling",
        "Guido",
        "Van",
        "Rossum"
      );
      Stream<String> streamFromListOfStrings = listOfStrings.stream();
      Stream<String> transformedListOfStrings = streamFromListOfStrings.map(
        aStringFromStream -> {
          LOGGER.info(
            String.format(
              "String is: '%s'\n",
              aStringFromStream
            )
          );
          return aStringFromStream.toUpperCase();
        }
      );
      transformedListOfStrings.forEach(
        aTransformedString -> LOGGER.info(
          String.format(
            "Transformed string is: '%s'\n",
            aTransformedString
          )
        )
      );
    return;
  }
}
