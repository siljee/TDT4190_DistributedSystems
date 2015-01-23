import java.rmi.*;

public interface MoveServer extends Remote {
	
	public Move makeMove() throws RemoteException;

}
