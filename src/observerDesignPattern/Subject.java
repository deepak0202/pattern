/******************************************************************************
*  Purpose: to provide subject interface
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package observerDesignPattern;

public interface Subject 
{
	public void register(Observer obj);
	public void unregister(Observer obj);
	public void notifyObservers();
	public Object getUpdate(Observer obj);
}
