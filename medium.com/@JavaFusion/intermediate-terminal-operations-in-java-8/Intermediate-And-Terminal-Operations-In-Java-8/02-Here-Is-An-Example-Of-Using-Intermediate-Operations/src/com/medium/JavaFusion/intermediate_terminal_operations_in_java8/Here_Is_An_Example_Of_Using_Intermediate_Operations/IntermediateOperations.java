package com.medium.JavaFusion.intermediate_terminal_operations_in_java8.Here_Is_An_Example_Of_Using_Intermediate_Operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

public class IntermediateOperations {
  public static void main( String... args ) {
      List<EmployeeRecord> employeeRecordList = Arrays.asList(
        new EmployeeRecord(
          "Muna",
          "IT",
          7500
        ),
        new EmployeeRecord(
          "Runa",
          "HR",
          90000
        ),
        new EmployeeRecord(
          "Kuna",
          "Finance",
          60000
        ),
        new EmployeeRecord(
          "Miku",
          "IT",
          75000
        ),
        new EmployeeRecord(
          "Sonu",
          "IT",
          24000
        ),
        new EmployeeRecord(
          "Mark",
          "HR",
          65000
        )
      );
      out.printf(
        "Employees firstname starting with capital letter 'M'\n"
      );
      /*
       * Filter employee records that start
       * with a capital letter 'M'
       */
      employeeRecordList.stream().filter(employeeRecord -> employeeRecord.firstName().startsWith("M")).forEach(out::println);
      out.printf(
        "Transform each employee firstname to uppercase\n"
      );
      /*
       * Map each employee first-name to
       * uppercase
       */
       employeeRecordList.stream().map(employeeRecord -> employeeRecord.firstName().toUpperCase()).forEach(out::println);
       out.printf(
         "Employee records sorted by their firstname\n"
       );
      /*
       * Sort employee-records by their
       * firstnames
       */
      employeeRecordList.stream().sorted(Comparator.comparing(employeeRecord -> employeeRecord.firstName())).forEach(out::println);
      List<String> words = List.of(
        "Hello",
        "Hello",
        "World",
        "World",
        "Java",
        "Stream",
        "Example"
      );
      out.printf(
        "Distinct words in input list\n"
      );
      // Distinct words in the input list
      words.stream().distinct().forEach(out::println);
      out.printf(
        "Contents of input list sorted lexicographically\n"
      );
      // Sorting contents of input list
      words.stream().sorted(Comparator.naturalOrder()).forEach(out::println);
      out.printf(
        "Skipping the last two items in the list and printing the rest\n"
      );
      /*
       * Skipping the last two items in
       * input list and printing the rest
       */
       words.stream().skip(2).forEach(System.out::println);
      out.printf(
        "Limit the listing of elements in the input list only to the first 3 " +
          "items\n"
      );
      /*
       * Limit the listing to only first
       * three elements
       */
      words.stream().limit(3).forEach(System.out::println);
    return;
  }
}