package com.medium.iamvivekojha.a_guide_to_java_streams_1.Java_Streams_Operations.forEach;

import com.medium.iamvivekojha.a_guide_to_java_streams_1.introduction.EngineerRecord;

import java.util.stream.Stream;

public class ForEach {
  public static void main( String... args ) {
      // Stream from one or more objects
      Stream.of(
        new EngineerRecord(
          1,
          "Vivek Ohja",
          150_000_000L
        ),
        new EngineerRecord(
          2,
          "Shubhangi Jadhav",
          150_000_000L
        ),
        new EngineerRecord(
          3,
          "Gaurang Mangal",
          150_000_000L
        )
      ).forEach(System.out::println);
    return;
  }
}
