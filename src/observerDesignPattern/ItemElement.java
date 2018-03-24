/******************************************************************************
*  Purpose: item element interface
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package observerDesignPattern;

public interface ItemElement 
{
	public int accept(ShoppingCartVisitor visitor);
}
