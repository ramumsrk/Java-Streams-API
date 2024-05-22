package com.medium.JavaFusion.intermediate_terminal_operations_in_java8.Here_Is_An_Example_Of_Using_Terminal_Operations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class TerminalOperations {
  static public void main( String[] args ) {
      List<Integer> listOfIntegers = List.of(
        1,
        2,
        3,
        4,
        5,
        3,
        5,
        1
      );
      /*
       * Transforming each element in the
       * input-list by 10 times and saving
       * the transformed element into anew
       * list
       */
      List<Integer> listOfTenTimesElement =
        listOfIntegers.stream().map(element -> element * 10).collect(Collectors.toList());
      out.printf(
        "%s transformed to %s\n",
        listOfIntegers,
        listOfTenTimesElement
      );
     /*
      * Transforming each element in the
      * input-list by 10 times and saving
      * the transformed element into anew
      * set.
      * Duplicate entries are filtered out
      */
      Set<Integer> setOfTenTimesElement =
      listOfIntegers.stream().map(element -> element * 10).collect(Collectors.toSet());
      out.printf(
        "%s transformed to %s\n",
        listOfIntegers,
        setOfTenTimesElement
      );
      // Number of elements in stream
      long numberOfStreamElements = listOfIntegers.stream().count();
      out.printf(
        "Number of elements in stream: %d\n",
        numberOfStreamElements
      );
      /*
       * Is there any element greater than three
       * in the stream?
       */
      boolean isThereAnyElementGreaterThanThree =
        listOfIntegers.stream().anyMatch(element -> element > 3);
      out.printf(
        "Is there any element %s greater than three? %s\n",
        listOfIntegers,
        isThereAnyElementGreaterThanThree
      );
      /*
       * None of the elements in the input list
       * are greater than 20
       */
      boolean noneOfTheElementsAreGreaterThanTwenty =
        listOfIntegers.stream().noneMatch(inputInteger -> inputInteger > 20);
      out.printf(
        "None of the elements in %s are greater than 20? %s\n",
        listOfIntegers,
        noneOfTheElementsAreGreaterThanTwenty
      );
      /*
       * Are all the elements in the input list
       * greater than zero
       */
      boolean areAllTheElementsInTheListGreaterThanTwenty =
        listOfIntegers.stream().allMatch(inputInteger -> inputInteger > 0);
      out.printf(
        "Are all the elements in %s greater than zero? %s\n",
        listOfIntegers,
        areAllTheElementsInTheListGreaterThanTwenty
      );
      /*
       * Sum of all the elements in the list
       */
      long sumOfListOfIntegers = listOfIntegers.stream().reduce(0,
        Integer::sum);
      out.printf(
        "Sum of all the elements in input list is %d\n",
        sumOfListOfIntegers
      );
    return;
  }
}
