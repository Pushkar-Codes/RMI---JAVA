import java.rmi.*;
public interface FiboIntf extends Remote
{
    int[] fiboseries(int n)throws RemoteException;
}