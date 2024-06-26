package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_reduction_07.the_collect_method_07_02;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CollectMethodDemo {
  private static final Logger LOGGER =
    Logger.getLogger(CollectMethodDemo.class.getName());
  static public void main(String... args) {
      List<String> listOfStrings = List.<String>of(
        "James",
        "Gosling",
        "Guido",
        "Van",
        "Rossum"
      );
      List<String> listOfUpperCasedStrings =
        listOfStrings.stream().map(String::toUpperCase).collect(Collectors.toUnmodifiableList());
      for (var upperCasedString : listOfUpperCasedStrings) {
        LOGGER.info(
          String.format(
            "Upper-cased string: '%s'\n",
            upperCasedString
          )
        );
      }
    return;
  }
}
