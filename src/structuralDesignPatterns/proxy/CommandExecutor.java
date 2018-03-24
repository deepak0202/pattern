/******************************************************************************
*  Purpose: to provide command executer interface
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.proxy;

public interface CommandExecutor
{
	public void runCommand(String cmd) throws Exception;
}
