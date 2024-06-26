package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_creation_02.stream_of_collection_02_02;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamFromCollectionDemo {
  private static final Logger LOGGER =
    Logger.getLogger(StreamFromCollectionDemo.class.getName());
  public static void main(String[] args) {
      List<String> listOfStrings = List.of(
        "A",
        "B",
        "C"
      );
      Stream<String> streamOfStringsFromListOfStrings = listOfStrings.stream();
      streamOfStringsFromListOfStrings.forEach(
        element -> LOGGER.info(
          String.format(
            "Element is: '%s'\n",
            element
          )
        )
      );
    return;
  }
}