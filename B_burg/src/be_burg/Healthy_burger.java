package be_burg;
import java.util.Scanner;

public class Healthy_burger extends Basic_burger 
{
	   int toppings;
	   String addToppings;
	   double  healthyBugCost = 0;
	   int burgerCount = 1;
	   
	double  BasicBurgerMenu()
	{
		return super.BasicBurgerMenu();
		
	}
	
	double healthyBurgerMenu()
	{
		if(burgerCount>=1)
		   {
			healthyBugCost = healthyBugCost + 4.50;
		   }
		   
		   System.out.println("Would you like to add some Toppings?(Y/N)");
		   System.out.println("PLEASE USE CAPITAL LETTER FOR YOUR INPUT");
		   Scanner obj = new Scanner(System.in);
		   addToppings = obj.nextLine();
		   
		   while(addToppings.contentEquals("Y"))
		   {
		   System.out.println("What toppins you want to add?");
		   System.out.println("1. Olives - 45c");
		   System.out.println("2. Sweet corn - 46c");
		   System.out.println("3. Cherry tomatoes - 47c");
		   System.out.println("4. Onion rings - 40c");
		   System.out.println("5. Tofu  - 80c");
		   System.out.println("6.thats all.....!!");
		   System.out.println("Choose your add-ons listing from 1-6");
		   Scanner obj1 = new Scanner(System.in);
		   toppings = obj1.nextInt();
		  
		  
		   switch(toppings)
			{
			case 1:
				healthyBugCost = healthyBugCost + 0.46;
				System.out.println("fresh green olives for $0.45");
				System.out.println();
				break;
			case 2:
				healthyBugCost = healthyBugCost + 0.45;
				System.out.println("sweet corn added for  $0.46");
				System.out.println();
				break;
			case 3:
				healthyBugCost = healthyBugCost + 0.47;
				System.out.println("Added Cherry tomatoes for $0.47");
				System.out.println();
				break;
			case 4:
				healthyBugCost = healthyBugCost+ 0.40;
				System.out.println("onion rings for extra 0.40");
				System.out.println();
				break;
			case 5:
				healthyBugCost = healthyBugCost + 0.80;
				System.out.println("Added Tofu for  0.80");
				System.out.println();
				break;
			case 6:
				System.out.println();
				addToppings = "N";
				System.out.println("Healthy burger price 4.50");
				System.out.println("Price for your Healthy burger after add-ons ..=> "+ healthyBugCost);
				
			}	
		   }
		   
		   burgerCount++;
		   return healthyBugCost;
	}
}



