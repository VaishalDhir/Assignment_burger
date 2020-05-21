package be_burg;

public class Deluxe_burger extends Basic_burger
{
	   double deluxeBugCost = 0;
	   int burgerCount = 1;
	   
	   double deluxeBurgerMenu()
		{
			if(burgerCount>=1)
			   {
				deluxeBugCost = deluxeBugCost + 9.0;
			   }
			   
			   System.out.println(" Here's the best of all combo's you'll ever had");
			   System.out.println(" Comes with 250 gm of plain salted potato chips");
			   System.out.println(" Choose any 450 ml of soft drink of your choice");
			   System.out.println(" added with Salsa and Cheese dip ");
			   
			   System.out.println("It comes with basic burger added with fries and drink adding its taste with two dips. ");
			   System.out.println("Price for yor Deluxe Burger...=> "+ deluxeBugCost);
			   
			   burgerCount++;
			   return deluxeBugCost;
		}

	
}

