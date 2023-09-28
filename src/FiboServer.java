import java.rmi.*;
public class FiboServer
{
    public static void main(String arg[])
    {
        try
        {
            FiboIntf Fi = new FiboImpl();
            Naming.rebind("FiboGen", Fi);
        }
        CS2307 – Network Lab Socket Programming
catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}