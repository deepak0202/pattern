/******************************************************************************
*  Purpose: to mahe class singleton by static block instatlisation 
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package com.bridgeit.creationalDesignPattern;
public class StaticBlockInitialization 
{
	 private static StaticBlockInitialization instance;
	    
	    private StaticBlockInitialization()
	    {
	    	System.out.println("constructer created");
	    }
	    static
	    {
	    	System.out.println("static block starts");
	        try
	        {
	            instance = new StaticBlockInitialization();
	        }catch(Exception e)
	        {
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	        System.out.println("static block ends");
	    }
	    
	    public static StaticBlockInitialization getInstance()
	    {
	    	System.out.println("from getInstance method");
	        return instance;
	    }
	    public static void main(String[] args) 
	    {
	    	StaticBlockInitialization inStaticBlockInitialization = StaticBlockInitialization.getInstance();
	    	StaticBlockInitialization inStaticBlockInitialization1 = StaticBlockInitialization.getInstance();
			System.out.println(inStaticBlockInitialization);
			System.out.println(inStaticBlockInitialization1);
		}
}
