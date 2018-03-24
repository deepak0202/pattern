/******************************************************************************
*  Purpose: to purchase beer
*  @author  Deepak Singh
*  @version 1.0
*  @since   22-03-2018
*
******************************************************************************/

package structuralDesignPatterns.facade;

import com.bridgeit.utility.Utility;

public class Client
{
	private static int choice;
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("wine shop open");
		do
		{
			System.out.println(" enter 1 for kingfisher");
			System.out.println("enter 2 for Beera");
			System.out.println("enter 3 for Tuborg");
			System.out.println("enter 4 for Carsberg");
			System.out.println("enter 5 to exit");
			System.out.println("enter your choise");
			choice = utility.inputInteger();
			ShopKeeper shopKeeper = new ShopKeeper();
			switch (choice)
              {
			case 1:
				shopKeeper.kingfisherSell();
				break;
			case 2:
				shopKeeper.beeraSell();
				break;
			case 3:
				shopKeeper.tuborgSell();
				break;
			case 4:
				shopKeeper.CarlsbergSell();
				break;
			default:
				System.out.println("we are going to close");
				break;
			}
		}
		while(choice < 5);	
	}
}