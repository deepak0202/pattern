/******************************************************************************
*  Purpose: to provide socket adapter
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.adapter;

public interface SocketAdapter 
{
	public Volt get120Volt();
	
	public Volt get12Volt();
	
	public Volt get3Volt();
}
