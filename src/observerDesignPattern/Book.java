/******************************************************************************
*  Purpose: to contain data and methods about books
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/
package observerDesignPattern;

public class Book  implements ItemElement
{
	private int price;
	private String isbnNumber;

	public Book(int cost, String isbn) 
	{
		this.price = cost;
		this.isbnNumber = isbn;
	}
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}