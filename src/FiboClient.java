import java.rmi.*;
import java.net.*;
public class FiboClient
{
    public static void main(String args[])
    {
        try
        {
            FiboIntf Fi = (FiboIntf) Naming.lookup("rmi://" +
                    args[0] + "/FiboGen");
            if (args.length != 2)
            {
                System.out.println("Usage: java FiboClient
                        <remoteip> <terms>");
                System.exit(-1);
            }
            int n = Integer.parseInt(args[1]);
            int a[]=Fi.fiboseries(n);
            System.out.print("\nFibonacci Series for " + n +
                    " terms : ");
            for(int i=0; i<n; i++)
                System.out.print(a[i] + " ");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
