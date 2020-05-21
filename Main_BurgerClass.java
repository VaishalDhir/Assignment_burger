package be_burg;
import java.util.Scanner;

public class MainBurgerClass
{
	public static void main(String[] args) 
	{
				String anotherBurger = "Y";
				Healthy_burger hburger = new Healthy_burger();
				Deluxe_burger dburger = new Deluxe_burger();
				double totalamt = 0;
				double basicCost = 0; 
				double healthyCost = 0;
				double deluxeCost = 0;
				
				while(anotherBurger.contentEquals("Y"))
				{
				int choose;
				System.out.println("1. Basic burger comes with a veg loaded patty added with lettuce and tomatoes and a bit of egg mayo at just $ 3.50");
				System.out.println("2. Healthy burger comes chiken patty tomatoe slice adding upon lettuce and mustard sauce just for $ 4.50");
				System.out.println("3. Deluxe comes with a combo of fries and a soft drink of your choice at just $ 9.0");
				System.out.println("4. Thats all....");
				   
				System.out.println("Choose your Burger");
			    Scanner scan0 = new Scanner(System.in);
				choose = scan0.nextInt();
				
				switch(choose)
					{
					case 1:
						hburger.BasicBurgerMenu();
						basicCost = hburger.basicBugCost;
						break;
					case 2:
						hburger.healthyBurgerMenu();
						healthyCost = hburger.healthyBugCost;
						break;
					case 3:
						dburger.deluxeBurgerMenu();
						deluxeCost = dburger.deluxeBugCost;
					}
			
				
				   System.out.println();
				   System.out.println("Craving for another Burger....??(Y/N)");
				   Scanner scan = new Scanner(System.in);
				   anotherBurger = scan.nextLine();
				}
				
				if(anotherBurger.contentEquals("N"))
				{
					totalamt = basicCost + healthyCost + deluxeCost;
					System.out.println();
					System.out.println("YOUR TOTAL ...=> "+ totalamt);
				}
				
			}

	}


