// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/testing/src/test/java/domain/PersonTest.java

package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** A simple test case for Person */
// tag::main[]
public class PersonTest {

  Person p;
  
  @Test
  public void testNameConcat() {
    String act = p.getFullName();
    assertEquals(act, "Ian Darwin", "Name concatenation");
  }

  @BeforeEach
  void setup() {
    p = new Person("Ian", "Darwin");
  }
}
// end::main[]
