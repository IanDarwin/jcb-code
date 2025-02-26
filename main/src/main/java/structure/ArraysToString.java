// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/structure/ArraysToString.java

import java.util.Arrays;
void main() {
// tag::main[]
record Cat(String name){
  public String toString() { return "Meower(" + name + ")";}
}
Cat[] pets = new Cat[]{new Cat("Tom"), new Cat("Slinky")};
System.out.println("Pets are " + Arrays.toString(pets));
// end::main[]
}
