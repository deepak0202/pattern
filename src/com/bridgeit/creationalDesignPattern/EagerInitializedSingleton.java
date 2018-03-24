/******************************************************************************
*  Purpose: singleton class by egaer inistatlisation 
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/
package com.bridgeit.creationalDesignPattern;

public class EagerInitializedSingleton 
{
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	private EagerInitializedSingleton()
	{
		System.out.println("instance created eagerInitializedSingleton");
	}
	public static EagerInitializedSingleton getInstance()
	{
		System.out.println("methot get binstance starts");
		return instance;
	}
	public static void main(String[] args) 
	{	
		EagerInitializedSingleton instance1 = getInstance();
		EagerInitializedSingleton instance2 = getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
	}
}