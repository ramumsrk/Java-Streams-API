package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_reduction_07.the_reduce_method_07_01;

import java.util.List;
import java.util.logging.Logger;

public class ReduceMethodDemo {
  private static final Logger LOGGER =
    Logger.getLogger(ReduceMethodDemo.class.getName());
  public static void main(String[] args) {
      List<Integer> listOfNumbers = List.<Integer>of(
        1,
        2,
        3,
        4,
        5
      );
      Integer sumOfListOfNumbers = listOfNumbers.stream().reduce(
        0,
        (firstNumber, secondNumber) -> firstNumber + secondNumber
      );
      LOGGER.info(
        String.format(
          "Sum of all numbers in list '%s' is '%d'\n",
          listOfNumbers,
          sumOfListOfNumbers
        )
      );
    return;
  }
}
