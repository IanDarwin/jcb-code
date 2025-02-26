// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/otherlang/ExecDemoSimple.java

package otherlang;

/**
 * ExecDemo shows how to execute an external program and read its output.
 */
// tag::main[]
public class ExecDemoSimple {

  // Choose one of kate, kwrite, gedit, notepad, wordpad, ...
  static final String EDITOR = "kwrite";

  public static void main(String args[]) throws Exception {
    
    // Run a "notepad" style editor
    Process p = Runtime.getRuntime().exec(new String[]{EDITOR});

    p.waitFor();
  }
}
// end::main[]
