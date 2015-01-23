import java.rmi.*;
import java.rmi.server.*;

public class MoveServerImpl extends UnicastRemoteObject implements MoveServer{
	
	private Move move;

	public MoveServerImpl(int x, int y) throws java.rmi.RemoteException {
		this.move = new Move(x,y);
	}

	@Override
	public Move makeMove() throws RemoteException {
		return move;
	}
	
	
	

}
