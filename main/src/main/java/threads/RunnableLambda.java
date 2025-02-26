// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/threads/RunnableLambda.java

package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// tag::main[]
public class RunnableLambda {

  private static ExecutorService threadPool =
    Executors.newSingleThreadExecutor();

  public static void main(String[] args) {
    threadPool.submit(() -> System.out.println("Hello from a thread"));
    // end::main[]
    threadPool.shutdown();
  }
}
