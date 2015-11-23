package edu.iut.app;

public interface IApplicationLog {
	/** TP1 : Creerr les methodes :
	 - setMessage
	  - getMessage
	  - addListener
	  - getApplicationLogListeners();
	*/
	public void setMessage(String Message);	
	
	public String getMessage();
	
	public void addListener(IApplicationLogListener listener);
	
	public IApplicationLogListener[] getApplicationLogListeners();
	
	
	
}
