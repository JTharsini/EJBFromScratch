package headfirst;

import javax.ejb.*;
import java.rmi.RemoteException;

public interface Advice extends EJBObject // extends EJBObject or EJBLocalObject
{
	public String getAdvice() throws RemoteException; // must declare RemoteException on all methods in this interface
}