import java.rmi.*;
import java.rmi.server.*;
public class FiboImpl extends UnicastRemoteObject implements
        FiboIntf
{
    public FiboImpl() throws RemoteException { }
    public int[] fiboseries(int n)throws RemoteException
    {
        int f1 = 0, f2 = 1, f3, i;
        int arr[]= new int[25];
        arr[0] = f1;
        arr[1] = f2;
        for(i=2; i<n; i++)
        {
            f3 = f1 + f2;
            arr[i] = f3;
            f1 = f2;
            f2 = f3;
        }
        return(arr);
    }
}
