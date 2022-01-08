package org.system;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("Calls - desktopSize from Desktop");
	}
    public static void main(String args[])
    {
    	//Creating object for child class
    	Desktop desktop = new Desktop();
    	
    	//Calling the parent and child class methods using child object
    	System.out.println("Calling the parent and child class methods using child object");
    	
    	desktop.computerModel();
    	desktop.desktopSize();
    }
}
