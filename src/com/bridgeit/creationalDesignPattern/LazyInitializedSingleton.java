/******************************************************************************
*  Purpose: singleton class by lazy initialization
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
******************************************************************************/

package com.bridgeit.creationalDesignPattern;

public class LazyInitializedSingleton 
{
private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton()
    {
    	System.out.println("from the constructor");
    }   
    public static LazyInitializedSingleton getInstance()
    {
    	System.out.println("method get Instance");
        if(instance == null)
        {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
    public static void main(String[] args) 
    {
    	LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
    	LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();
		System.out.println(lazyInitializedSingleton);
		System.out.println(lazyInitializedSingleton2);
	}
}