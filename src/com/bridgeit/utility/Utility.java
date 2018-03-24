/******************************************************************************
*  Purpose: to contain methods related to patterns
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
******************************************************************************/
package com.bridgeit.utility;

import java.util.Scanner;

import com.bridgeit.creationalDesignPattern.Computer;
import com.bridgeit.creationalDesignPattern.Pc;
import com.bridgeit.creationalDesignPattern.Server;

public class Utility 
{
	static Scanner scanner;
	/**
	 * this class constructer
	 */
	public Utility() 
	{
		scanner = new Scanner(System.in);
	}
	
	/**
	 * @return string input by the user
	 */
	public String inputString()
	{
		try 
		{
			return scanner.next();
			
		}
		catch (Exception e) 
		{
			return "";
		}
	}
	/**
	 * @return integer enter by6 the user
	 */
	public int inputInteger()
	{
		try 
		{
			return scanner.nextInt();
			
		}
		catch (Exception e) 
		{
			return 0;
		}
	}
	
	/**
	 * @param type
	 * @param ram
	 * @param hdd
	 * @param cpu
	 * @return class object which requreid by the method
	 */
	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type))
		{
			return new Pc(ram, hdd, cpu);
		}
		else if("Server".equalsIgnoreCase(type))
		{
			return new Server(ram, hdd, cpu);
		}
		return null;
	}
}