// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/di0/SpringMain.java

package di0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// tag::main[]
public class SpringMain {
  public static void main(String[] args) {
        ApplicationContext ctx =
      new AnnotationConfigApplicationContext("di0");
        
        Processor processor = ctx.getBean(Processor.class);
        
    processor.process(2,3);
  }
}
// end::main[]
