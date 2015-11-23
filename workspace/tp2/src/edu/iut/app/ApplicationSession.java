package edu.iut.app;

import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationSession {
	
	// Exercice 1 : Gerer l'internationation
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;


	private static /*Qu'est ce qu'un singleton ?*/ ApplicationSession session = null;
	private ApplicationSession() {
		/* Definir US comme locale par defaut */
		Locale.setDefault(Locale.US);
		
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("res.properties", locale);
		sessionGuiLogger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		sessionGuiLogger.setLevel(Level.ALL);
		sessionExceptionLogger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		sessionExceptionLogger.setLevel(Level.ALL);
	}
	
	
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle = ResourceBundle.getBundle("res.properties", locale);
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}


	public Locale getLocale() {
		return locale;
	}


	
	
}
