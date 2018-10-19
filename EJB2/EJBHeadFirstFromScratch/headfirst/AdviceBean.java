package headfirst;

import javax.ejb.*;

public class AdviceBean implements SessionBean
{
	private String[] adviceStrings = {"One word: inappropriate.", "You might want to rethink that haircut.", "Your boss will respect you if you tell him what you really think of him.",
									"Visualize yourself with better clothes.", "Of course you don't have to go to work today.", "Do you really think you should be leaving the house like that?",
									"Read a book, once a year whether you need to or not."};
									
	public void ejbActivate()
	{
		System.out.println("EJB activated");
	}
	
	public void ejbPassivate()
	{
		System.out.println("EJB passivated");
	}
	
	public void ejbRemove()
	{
		System.out.println("EJB removed");
	}
	
	public void setSessionContext(SessionContext ctx)
	{
		System.out.println("session context");
	}
	
	public String getAdvice()
	{
		System.out.println("in get advice");
		int random = (int)(Math.random() * adviceStrings.length);
		return adviceStrings[random];
	}
	
	// this method doesn't come from the SessionBean interface
	public void ejbCreate()
	{
		System.out.println("in ejb create");
	}
}