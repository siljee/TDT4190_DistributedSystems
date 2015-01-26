import java.rmi.*;

public interface MoveServer extends Remote {
	
	void updateBoard(int x, int y, char symbol) throws RemoteException;
	void startGame(MoveServer opponent) throws RemoteException;

}
