/******************************************************************************
*  Purpose: to test proxy pattern
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.proxy;

public class ProxyPatternTest 
{
	public static void main(String[] args)
	{
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try 
		{
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Message::"+e.getMessage());
		}
	}
}