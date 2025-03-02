// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/graal/src/main/java/graaldemo/JavaCallJS.java

package graaldemo;

import java.io.*;

import org.graalvm.polyglot.*;

/**
 * GraalVM polyglot: calling JavaScript from Java/
 */
public class JavaCallJS {

  public static void main(String[] args) {

    Context context = Context.create("js");
    Value result = context.eval("js", "2 + 2");
    int i = result.asInt();
    System.out.println(i);
  }
}
