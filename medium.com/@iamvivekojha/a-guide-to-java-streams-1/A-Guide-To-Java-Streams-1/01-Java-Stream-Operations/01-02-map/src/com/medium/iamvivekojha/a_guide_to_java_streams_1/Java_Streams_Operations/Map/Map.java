package com.medium.iamvivekojha.a_guide_to_java_streams_1.Java_Streams_Operations.Map;

import com.medium.iamvivekojha.a_guide_to_java_streams_1.introduction.EngineerRecord;

import java.util.stream.Stream;

public class Map {
  static public void main( String... args ) {
      Stream<String> transformedEngineerRecordsStream = Stream.of(
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
      ).map( engineerRecord -> engineerRecord.engineerName().toUpperCase());
      transformedEngineerRecordsStream.forEach(System.out::println);
    return;
  }
}