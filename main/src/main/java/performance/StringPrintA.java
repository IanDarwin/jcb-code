// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/performance/StringPrintA.java

package performance;

// tag::main[]
public class StringPrintA {
  public static void main(String[] argv) {
    Object o = "Hello World";
    for (int i=0; i<100000; i++) {
      System.out.println("<p><b>" + o.toString() + "</b></p>");
    }
  }
}
// end::main[]
