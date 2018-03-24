/******************************************************************************
*  Purpose: to make only one method at atime can acces method
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package com.bridgeit.creationalDesignPattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable 
{
	 private static final long serialVersionUID = -7604766932017737115L;
	    private SerializedSingleton()
	    {
	    	System.out.println("from constructor");
	    }
	    private static class SingletonHelper
	    {
	        private static final SerializedSingleton instance = new SerializedSingleton();
	    }
	    public static SerializedSingleton getInstance()
	    {
	        return SingletonHelper.instance;
	    }
	    public static void main(String[] args) 
	    {
	    	SerializedSingleton serializedSingleton = SerializedSingleton.getInstance();
	    	SerializedSingleton serializedSingleton2 = SerializedSingleton.getInstance();
	    	System.out.println(serializedSingleton);
	    	System.out.println(serializedSingleton2);			
		}
}