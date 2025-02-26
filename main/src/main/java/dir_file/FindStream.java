// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/dir_file/FindStream.java

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

// tag::main[]
void main() {
  var dirName = "/home/ian/book";
  try (Stream<Path> paths = Files.find(Path.of(dirName), 
    Integer.MAX_VALUE,
    (path, attr) -> {
      return attr.isRegularFile() && (
        path.toString().endsWith(".adoc") ||
        path.toString().endsWith(".asciidoc"));
    })) {
    paths.forEach(System.out::println);
    }
  catch (IOException ex) {
    ex.printStackTrace();
  }
}
// end::main[]
