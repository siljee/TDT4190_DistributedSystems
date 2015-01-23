import java.rmi.*;

public interface LaaneTjener extends Remote {

	public Plan lagPlan(int laaneSum, int varighet) throws RemoteException;
}
