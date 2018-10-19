package headfirst;

import javax.ejb.*;
import java.rmi.RemoteException;

public interface AdviceHome extends EJBHome // The home must extend either the EJBHome or EJBLocalHome
{
	public Advice create() throws CreateException, RemoteException; // need both of these exceptions and return type should be Component interface type
}