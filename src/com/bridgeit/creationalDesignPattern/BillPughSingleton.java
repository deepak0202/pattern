/******************************************************************************
*  Purpose: make class singleton by useing static inner class
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/
package com.bridgeit.creationalDesignPattern;

public class BillPughSingleton 
{
	 private BillPughSingleton()
	 {
		System.out.println("from constructer"); 
	 }
	    private static class SingletonHelper
	    {
	        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	    }
	    public static BillPughSingleton getInstance()
	    {
	        return SingletonHelper.INSTANCE;
	    }
	    public static void main(String[] args) 
	    {
	    	BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
	    	BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
	    	System.out.println(billPughSingleton);
	    	System.out.println(billPughSingleton2);
		}
}