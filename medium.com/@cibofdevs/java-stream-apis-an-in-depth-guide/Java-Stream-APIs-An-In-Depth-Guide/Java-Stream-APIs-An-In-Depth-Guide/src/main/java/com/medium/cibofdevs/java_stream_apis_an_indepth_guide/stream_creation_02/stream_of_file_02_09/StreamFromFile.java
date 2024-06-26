package com.medium.cibofdevs.java_stream_apis_an_indepth_guide.stream_creation_02.stream_of_file_02_09;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamFromFile {
  private static final Logger LOGGER = Logger.getLogger(StreamFromFile.class.getName());
  static public void main(String[] args) {
      try (Stream<String> streamOfLinesFromAFile =
             Files.lines(Paths.get("/run/media/ramumsrk/1" +
               ".0TiB/Java-Streams-API/medium.com/@cibofdevs/java-stream-apis-an-in-depth-guide/Java-Stream-APIs-An-In-Depth-Guide/Java-Stream-APIs-An-In-Depth-Guide/src/main/resources/example.txt"))) {
        streamOfLinesFromAFile.forEach(
          aSingleLineFromAFile -> LOGGER.info(
            String.format(
              "%s",
              aSingleLineFromAFile
            )
          )
        );
      } catch (Exception exception) {
        LOGGER.severe(exception.toString());
      }
    return;
  }
}
