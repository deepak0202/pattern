/******************************************************************************
*  Purpose: to make singleton class in thread safe enviroment
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/
package com.bridgeit.creationalDesignPattern;

public class ThreadSafeSingleton 
{
private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton()
    {
    	
    }
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
