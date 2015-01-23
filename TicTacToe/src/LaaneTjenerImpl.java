import java.rmi.*;
import java.rmi.server.*;

public class LaaneTjenerImpl extends UnicastRemoteObject implements LaaneTjener {

	private double rentefot;
	
	public LaaneTjenerImpl(double rentefot) throws java.rmi.RemoteException {
		this.rentefot = rentefot;
	}

	@Override
	public Plan lagPlan(int laaneSum, int varighet) throws RemoteException {
		return new Plan(rentefot, laaneSum, varighet);
	}
}
