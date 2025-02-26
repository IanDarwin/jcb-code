// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/strings/StringReverse.java

package strings;

import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Reverse a string by word.
 */
public class StringReverse {
  public static void main(String[] argv) {
    // tag::main[]
    String sample = "Father Charles Goes Down And Ends Battle";

    // An older way
    // Put it in the stack frontward
    Stack<String> myStack = new Stack<>();
    var forward = sample.split("\\s");
    for (String str : forward) {
      myStack.push(str);
    }

    // Print the stack backward
    while (!myStack.empty()) {
      System.out.print(myStack.pop());
      System.out.print(' ');  // inter-word spacing
    }
    System.out.println();
    // end::main[]

    // tag::list-reversed[]
    // The easier way (Java 21+, no temporary variables)
    System.out.println(String.join(" ",
      List.of(sample.split("\\s")).reversed()));
    // end::list-reversed[]
  }
}
