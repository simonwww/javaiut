
package edu.iut.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iut.app.*;

// Exercice 2 
public class IUTException /* �tendre les exceptio, */ extends Exception{
	
	public IUTException() {
		super();
		// Logger une erreur avec le message empty en utilisant le singleton session, ie le logger d�fini dans la session */
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(" ");
	}
	public IUTException(IUTException e) {
		super(e);
		// Logger une erreur avec le message contenu dans 'e'  en utilisant le singleton session, ie le logger d�fini dans la session */
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
		}
	public IUTException(String message) {
		super(message);
		// Logger une erreur avec le message contenu dans 'message'  en utilisant le singleton session, ie le logger d�fini dans la session */
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}