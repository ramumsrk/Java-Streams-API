package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.parallel_streams_08;

import java.util.List;
import java.util.logging.Logger;

public class ParallelStreamsDemo {
  private static final Logger LOGGER =
    Logger.getLogger(ParallelStreamsDemo.class.getName());
  static public void main(String[] args) {
      List<String> listOfStrings = List.<String>of(
        "James",
        "Gosling",
        "Guido",
        "Van",
        "Rossum"
      );
      listOfStrings.parallelStream().filter(
        element -> {
          LOGGER.info(
            String.format(
              "Intermediate operation filter on '%s' being done by '%s'\n",
              element,
              Thread.currentThread().getName()
            )
          );
          return true;
        }
      ).map(
        element -> {
            LOGGER.info(
              String.format(
                "Map intermediate operation on '%s' being done by '%s'\n",
                element,
                Thread.currentThread().getName()
              )
            );
          return element.toUpperCase();
        }
      ).forEach(
        element -> LOGGER.info(
          String.format(
            "Terminal operation forEach on '%s' being done by '%s'\n",
            element,
            Thread.currentThread().getName()
          )
        )
      );
    return;
  }
}
