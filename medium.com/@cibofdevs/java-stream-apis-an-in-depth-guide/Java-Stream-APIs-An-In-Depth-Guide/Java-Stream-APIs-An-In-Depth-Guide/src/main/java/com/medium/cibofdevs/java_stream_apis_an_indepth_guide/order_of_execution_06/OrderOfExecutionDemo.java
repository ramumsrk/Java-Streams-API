package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.order_of_execution_06;

import java.util.List;
import java.util.logging.Logger;

public class OrderOfExecutionDemo {
  private static final Logger LOGGER =
    Logger.getLogger(OrderOfExecutionDemo.class.getName());
  static public void main(String... args) {
      List<String> listOfStrings = List.<String>of(
        "James",
        "Gosling",
        "Guido",
        "Van",
        "Rossum"
      );
      listOfStrings.stream().map(
        sampleString -> {
            LOGGER.info(
              String.format(
                "Sample string is: '%s'\n",
                sampleString
              )
            );
          return sampleString.toUpperCase();
        }
      ).filter(
        sampleUpperCasedString -> {
            LOGGER.info(
              String.format(
                "Sample upper-cased string is: '%s'\n",
                sampleUpperCasedString
              )
            );
          return sampleUpperCasedString.startsWith("J");
        }
      ).forEach(
        sampleUpperCaseStringStartingWithLetterJ -> LOGGER.info(
          String.format(
            "Sample upper-cased string starting with letter 'J' is: '%s'\n",
            sampleUpperCaseStringStartingWithLetterJ
          )
        )
      );
    return;
  }
}