// DO NOT EDIT this file; make changes in Git repo e.g.,
// darwinsys-api/src/demo/java/com/darwinsys/io/FileIoDemo.java

// tag::main[]
package com.darwinsys.io;

import java.io.IOException;

public class FileIoDemo {
    public static void main(String[] av) {
        try {
            FileIO.copyFile("FileIO.java", "FileIO.bak");
            FileIO.copyFile("FileIO.class", "FileIO-class.bak");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
// end::main[]
