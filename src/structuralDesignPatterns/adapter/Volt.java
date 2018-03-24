/******************************************************************************
*  Purpose: to provide volt
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.adapter;

public class Volt 
{
private int volts;
	
	public Volt(int v)
	{
		this.volts=v;
	}

	public int getVolts() 
	{
		return volts;
	}

	public void setVolts(int volts) 
	{
		this.volts = volts;
	}

}
