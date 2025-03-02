// DO NOT EDIT this file; make changes in Git repo e.g.,
// javasrc/main/src/main/java/network/DaytimeObjectServer.java

package network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

/**
 * DaytimeObjectServer - server for the non-standard Time (LocalDateTime object) service.
 * @author Ian F. Darwin
 */
// tag::main[]
public class DaytimeObjectServer {
  /** The TCP port for the object time service. */
  public static final short TIME_PORT = 1951;

  public static void main(String[] argv) {
    ServerSocket sock;
    Socket  clientSock;
    try {
      sock = new ServerSocket(TIME_PORT);
      while ((clientSock = sock.accept()) != null) {
        System.out.println("Accept from " + 
          clientSock.getInetAddress());
        ObjectOutputStream os = new ObjectOutputStream(
          clientSock.getOutputStream());

        // Construct and write the Object
        os.writeObject(LocalDateTime.now());

        os.close();
      }

    } catch (IOException e) {
      System.err.println(e);
    }
  }
}
// end::main[]
