/******************************************************************************
*  Purpose: to provide carlsberg class
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.facade;

public class Carlsberg implements BeerShop
{

	@Override
	public void beerType() {
		// TODO Auto-generated method stub
		System.out.println("mild");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("rs 160");
	}
	

}
