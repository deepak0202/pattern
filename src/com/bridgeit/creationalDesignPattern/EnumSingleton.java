/******************************************************************************
*  Purpose: makeing singleton by enum 
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/
package com.bridgeit.creationalDesignPattern;

public enum EnumSingleton 
{
	    INSTANCE;
	private EnumSingleton() 
	{
		System.out.println("from enum constuctor");
	}
	@Override
	public String toString()
	{
		
		return this.hashCode() + "";
	}
	    
	    public static EnumSingleton doSomething()
	    {
	    	return INSTANCE;
	    }
	    public static void main(String[] args) 
	    {
	    	EnumSingleton enumSingleton = EnumSingleton.doSomething();
	    	EnumSingleton enumSingleton2 = EnumSingleton.doSomething();
	    	System.out.println(enumSingleton);
	    	System.out.println(enumSingleton2);
			
		}
}


