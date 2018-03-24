/******************************************************************************
*  Purpose: to provied observer interface
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package observerDesignPattern;

public interface Observer 
{
    public void update();
	public void setSubject(Subject sub);
}
