/******************************************************************************
*  Purpose: to represent computer of server type
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
******************************************************************************/
package com.bridgeit.creationalDesignPattern;

public class Server extends Computer
{
	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String cpu)
	{
		System.out.println("from server constructor");
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() 
	{
		return this.ram;
	}
	@Override
	public String getHDD() 
	{
		return this.hdd;
	}
	@Override
	public String getCPU() 
	{
		return this.cpu;
	}
}