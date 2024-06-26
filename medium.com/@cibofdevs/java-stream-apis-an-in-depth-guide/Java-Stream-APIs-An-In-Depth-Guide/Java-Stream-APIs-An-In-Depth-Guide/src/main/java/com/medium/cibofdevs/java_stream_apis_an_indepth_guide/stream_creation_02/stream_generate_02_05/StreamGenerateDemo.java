package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_creation_02.stream_generate_02_05;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamGenerateDemo {
  private static final Logger LOGGER =
    Logger.getLogger(StreamGenerateDemo.class.getName());
  public static void main(String... args) {
      Stream<Double> finiteStreamOfRealNumbers =
        Stream.<Double>generate(Math::random).limit(3);
      finiteStreamOfRealNumbers.forEach(
        realNumber -> LOGGER.info(
          String.format(
            "Real number is: '%f'\n",
            realNumber
          )
        )
      );
    return;
  }
}
