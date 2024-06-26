package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.referencing_a_stream_03;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class ReferencingAStreamDemo {
  private static final Logger LOGGER =
    Logger.getLogger(ReferencingAStreamDemo.class.getName());
  static public void main(String... args) {
      List<String> listOfStrings = List.<String>of(
        "James",
        "Gosling",
        "Guido",
        "Van",
        "Rossum"
      );
      Stream<String> streamOfStringsFromListOfStrings = listOfStrings.stream();
      streamOfStringsFromListOfStrings.forEach(
        string -> LOGGER.info(
          String.format(
            "String is: '%s'\n",
            string
          )
        )
      );
      try {
        long countOfElementsInStream = streamOfStringsFromListOfStrings.count();
      } catch (IllegalStateException illegalStateException) {
        LOGGER.severe(illegalStateException.getMessage());
      }
    return;
  }
}