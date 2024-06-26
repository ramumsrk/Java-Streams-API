package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_creation_02.stream_of_primitives_02_07;

import java.util.logging.Logger;
import java.util.stream.IntStream;

public class PrimitiveStreamsDemo {
  private static final Logger LOGGER =
    Logger.getLogger(PrimitiveStreamsDemo.class.getName());
  public static void main(String... args) {
      IntStream primitiveIntegerStream = IntStream.range(1, 4);
      primitiveIntegerStream.forEach(
        primitiveInteger -> LOGGER.info(
          String.format(
            "Value of integer value: '%d'\n",
            primitiveInteger
          )
        )
      );
    return;
  }
}
