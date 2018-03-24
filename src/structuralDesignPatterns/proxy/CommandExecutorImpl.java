/******************************************************************************
*  Purpose: to implement command executer interface
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor
{
	public void runCommand(String cmd) throws IOException
	{
       
Runtime.getRuntime().exec(cmd);
System.out.println("'" + cmd + "' command executed.");
}

}
