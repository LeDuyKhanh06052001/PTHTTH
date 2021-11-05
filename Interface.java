import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote{
    public int demtu(String s) throws RemoteException;
    public String daochuoi(String s) throws RemoteException;
}
