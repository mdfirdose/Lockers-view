package com.LockersView.services;

import com.LockersView.Screen.FileOptionsScreeen;
import com.LockersView.Screen.Screeen;
import com.LockersView.Screen.WelcomeScreeen;
import com.LockersView.entities.Directory;

public class ScreenServicee {
	static Directory dir = new Directory();
	
	
	
		public static WelcomeScreeen WelcomeScreeen = new WelcomeScreeen();
	    public static FileOptionsScreeen FileOptionsScreeen = new FileOptionsScreeen();
	    
	    

	    public static Screeen CurrentScreen = WelcomeScreeen;

	    
	    public static Screeen getCurrentScreen() {
	        return CurrentScreen;
	    }

	    
	    public static void setCurrentScreen(Screeen currentScreen) {
	        CurrentScreen = currentScreen;
	    }
	    
	    

}
