import java.rmi.*;

/* Methods defined in this interface can be referenced remotly.
 *	All methods trows a remoteException in case of 
 *  error when communication over the network.
 */
public interface MoveServer extends Remote {
	
	void updateBoard(int x, int y, char symbol) throws RemoteException;
	void startGame(MoveServer opponent) throws RemoteException;

}
