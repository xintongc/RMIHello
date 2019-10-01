import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServant extends UnicastRemoteObject implements HelloService { //server-side singleton

    public HelloServant() throws RemoteException{ //constructor
        super();
    }

    @Override
    public String echo(String input) throws RemoteException {
        return "From server: " + input;
    }
}
