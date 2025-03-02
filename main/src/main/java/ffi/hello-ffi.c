// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/ffi/hello-ffi.c

// tag::main[]
/*
 * A silly library just for the FFI demo.
 */

#include <stdio.h>
#include <string.h>

char* sketches[] = {
  "Dead Parrot Sketch",
  "Ministry of Silly Walks",
  "The Funniest Joke In The World",
  "Hell's Grannies"
};

int nSketches = sizeof(sketches)/sizeof(char*);

int updatesketch(int n, char* newVal) {
  if (n > nSketches) {
    fprintf(stderr, "Try to update non-existent sketch!");
    return -1;
  }
  sketches[n] = strdup(newVal);
  printf("Setting %d to %s\n", n, newVal);
  return n;
}

char* pythonsketch(int n) {
  if (n > nSketches)
    return "Very silly";
  return sketches[n];
}

/* A main program, just to show that the function works */
int main(int argc, char **argv) {
  updatesketch(2, "Always look on the bright side of life");
  puts(pythonsketch(2));
}
// end::main[]
