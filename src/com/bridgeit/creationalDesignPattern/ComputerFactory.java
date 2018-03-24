/******************************************************************************
*  Purpose: to represent factor pattern
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/
package com.bridgeit.creationalDesignPattern;

import com.bridgeit.utility.Utility;

public class ComputerFactory 
{
	
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("enter your choise of computer from below");
		ComputerType[] computerTypes = ComputerType.values();
		for(ComputerType ct : computerTypes)
		{
			System.out.println(ct);
		}
		String type =utility.inputString();
		System.out.println("enter the ram");
		String ram = utility.inputString();
		System.out.println("enter hdd");
		String hdd = utility.inputString();
		System.out.println("enter cpu");
		String cpu = utility.inputString();
		
		Utility.getComputer(type, ram, hdd, cpu);	
	}
}