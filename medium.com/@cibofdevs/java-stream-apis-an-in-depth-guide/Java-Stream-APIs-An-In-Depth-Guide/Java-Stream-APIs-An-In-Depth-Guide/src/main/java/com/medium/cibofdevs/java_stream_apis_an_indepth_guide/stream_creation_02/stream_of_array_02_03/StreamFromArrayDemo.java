package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_creation_02.stream_of_array_02_03;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamFromArrayDemo {
  private static final Logger LOGGER =
    Logger.getLogger(StreamFromArrayDemo.class.getName());
  static public void main(String[] args) {
      String[] arrayOfStrings = {
        "James",
        "Gosling",
      };
      Stream<String> streamOfStringsFromArrayOfStrings =
        Arrays.stream(arrayOfStrings);
      streamOfStringsFromArrayOfStrings.forEach(
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