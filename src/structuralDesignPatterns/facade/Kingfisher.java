/******************************************************************************
*  Purpose: to provide kingfisher class
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.facade;

public class Kingfisher implements BeerShop 
{

	@Override
	public void beerType() {
		// TODO Auto-generated method stub
		System.out.println("To strong");
		
	}

	@Override
	public void price() 
	{
		// TODO Auto-generated method stub
		System.out.println("rs 140");
		
	}

}
