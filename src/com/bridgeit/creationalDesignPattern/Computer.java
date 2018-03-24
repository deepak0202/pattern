/******************************************************************************
*  Purpose: to contain un-implemented methods of computer 
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/
package com.bridgeit.creationalDesignPattern;

public abstract class Computer 
{
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() 
	{
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}	
}