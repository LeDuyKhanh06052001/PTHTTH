import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Server {
  public static void main(String[] args) {
      try {
        LocateRegistry.createRegistry(6565);
        Naming.bind("rmi://localhost:6565/Service1", new Implement());
        System.out.println("Da tao server");
      } catch (Exception e) {
          System.out.println("Loi");
      }
  }
}
