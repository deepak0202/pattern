/******************************************************************************
*  Purpose: to provide shopkeper class
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.facade;

public class ShopKeeper 
{
	public BeerShop Beera;
	public BeerShop Kingfisher;
	public BeerShop Tuborg;
	public BeerShop Carlsberg;
	
	public ShopKeeper()
	{
		Beera = new Beera();	
        Kingfisher = new Kingfisher();
        Tuborg = new Kingfisher();
        Carlsberg = new Carlsberg();
	}
	public void kingfisherSell()
	{
		Kingfisher.beerType();
		Kingfisher.price();
	}
	public void beeraSell()
	{
		Beera.beerType();
		Beera.price();
	}
	public void tuborgSell()
	{
		Tuborg.beerType();
		Tuborg.price();
	}
	public void CarlsbergSell()
	{
		Carlsberg.beerType();
		Carlsberg.price();
	}
	

}
