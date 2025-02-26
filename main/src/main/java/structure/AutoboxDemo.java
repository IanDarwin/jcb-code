// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/structure/AutoboxDemo.java

package structure;

// tag::main[]
public class AutoboxDemo {
    
    /** Shows autoboxing (in the call to foo(i), i is wrapped automatically)
     * and auto-unboxing (the return value is automatically unwrapped).
     */
    public static void main(String[] args) {
        int i = 42;
        int result = foo(i);            // <1>
        System.out.println(result);
    }

    public static Integer foo(Integer i) {
        System.out.println("Object = " + i);
        return Integer.valueOf(123);    // <2>
    }
}
// end::main[]
