package be_burg;
import java.util.Scanner;

public class Basic_burger 
{
	   int toppings;
	   String addToppings;
	   double basicBugCost = 0;
	   int burgerCount = 1;
	   
	   
	   double BasicBurgerMenu()
	   {
		   
		   if(burgerCount >= 1)
		   {
			   
			   basicBugCost = basicBugCost + 3.50;
		   }
		   
		   System.out.println("Would you like to add some Toppings?(Y/N)");
		   System.out.println("PLEASE USE CAPITAL LETTER FOR YOUR INPUT");
		   Scanner obj = new Scanner(System.in);
		   addToppings = obj.nextLine();
		   
		   while(addToppings.contentEquals("Y"))
		   {
		   System.out.println("Make your own burger !!....choose your Toppings?");
		   System.out.println("1. Olives - 45c");
		   System.out.println("2. Sweet corn - 46c");
		   System.out.println("3. Cherry tomatoes - 47c");
		   System.out.println("4. Cheese slice - $ 1.30");
		   System.out.println("5. chiken patties - $1.00");
		   System.out.println("6. Mint sauce - 30c");
		   System.out.println("7. Onion rings - 40c");
		   System.out.println("8. thats all.....!!");
		   System.out.println("Tell us your add-ons listing from 1-8");
		   Scanner obj1 = new Scanner(System.in);
		   toppings = obj1.nextInt();
		  
		  
		   switch(toppings)
			{
			case 1:
				basicBugCost = basicBugCost + 0.45;
				System.out.println("fresh green olives for $0.45");
				System.out.println();
				break;
			case 2:
				basicBugCost = basicBugCost + 0.46;
				System.out.println("sweet corn added for  $0.46");
				System.out.println();
				break;
			case 3:
				basicBugCost =basicBugCost + 0.47;
				System.out.println("Added Cherry tomatoes for $0.47");
				System.out.println();
				break;
			case 4:
				basicBugCost = basicBugCost + 1.30;
				System.out.println("Cheese slice added of $1.30");
				System.out.println();
				break;
			case 5:
				basicBugCost = basicBugCost + 1.00;
				System.out.println("Additional Chiken patties for $1.00");
				System.out.println();
				break;
			case 6:
				basicBugCost = basicBugCost + 0.30;
				System.out.println("Mint sauce for extra $0.30");
				System.out.println();
				break;
			case 7:
				basicBugCost = basicBugCost + 0.40;
				System.out.println("Onion rings for extra $0.40");
				System.out.println();
				break;
			case 8:
				System.out.println();
				addToppings = "N";
				System.out.println("Basic burger price $ 3.50");
				System.out.println("Price  for  Your Basic burger is after add-ons....=> "+ basicBugCost);
				
			}	
		   }
		   
		   burgerCount ++;
		   return basicBugCost;
	   }
		
	}


