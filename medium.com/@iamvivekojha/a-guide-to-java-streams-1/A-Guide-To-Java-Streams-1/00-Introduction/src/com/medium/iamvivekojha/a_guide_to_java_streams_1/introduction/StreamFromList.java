package com.medium.iamvivekojha.a_guide_to_java_streams_1.introduction;

import java.util.List;
import java.util.stream.Stream;

public class StreamFromList {
  public static void main( String... args ) {
      // Data source
      List<EngineerRecord> listOfEngineerRecords = List.of(
          new EngineerRecord(
          1,
          "Vivek Ojha",
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
      );
      Stream<EngineerRecord> streamOfEngineerRecords =
      listOfEngineerRecords.stream();
    return;
  }
}