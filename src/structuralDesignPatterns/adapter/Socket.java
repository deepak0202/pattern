/******************************************************************************
*  Purpose: to provide socket
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.adapter;

public class Socket 
{
	public Volt getVolt()
	{
		return new Volt(120);
	}
}
