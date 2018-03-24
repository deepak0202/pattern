/******************************************************************************
*  Purpose: to make shopping cart interface 
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package observerDesignPattern;

public interface ShoppingCartVisitor 
{
	int visit(Book book);
	int visit(Fruit fruit);
}
