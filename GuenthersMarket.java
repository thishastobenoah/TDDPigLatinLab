import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class GuenthersMarket {
	public static void menuPrinter (){
		System.out.println("");
		System.out.println("ITEM            PRICE");
		System.out.println("=============================");
		System.out.println("apple           $0.99");
		System.out.println("banana          $0.59");
		System.out.println("cauliflower     $1.59");
		System.out.println("dragonfruit     $2.19");
		System.out.println("elderberry      $1.79");
		System.out.println("figs            $2.09");
		System.out.println("grapefruit      $1.99");
		System.out.println("honeydew        $3.49");
	}
	public static Double averagePrice (ArrayList<Double>itemList) {
		double total = 0.00;
		for (int i = 0; i < itemList.size(); i++) {
			total += itemList.get(i);
		}
		return (total/itemList.size());
	}
	public static void highestItem (ArrayList<Double>priceList) {
		int highIndex = priceList.indexOf(Collections.max(priceList));
		System.out.println("The index of the MOST expensive item was:" + highIndex);
	}
	public static void lowestItem(ArrayList<Double>priceList) {
		int lowIndex = priceList.indexOf(Collections.min(priceList));
		System.out.println("The index of the LEAST expensive item was:" + lowIndex);
	}
	public static void main (String[] args) {
		char loopResponse;
		Scanner userInput = new Scanner (System.in);
		String itemSelection;
		ArrayList<Double> orderPrice = new ArrayList<Double>();
		ArrayList<String>orderItem	= new ArrayList <String>();
		HashMap<String, Double> menu = new HashMap<String, Double>();
		menu.put("apple", 0.99);
		menu.put("banana", 0.59);
		menu.put("cauliflower", 1.59);
		menu.put("dragonfruit", 2.19);
		menu.put("elderberry", 1.79);
		menu.put("figs", 2.09);
		menu.put("grapefruit", 1.99);
		menu.put("honeydew", 3.49);
		System.out.println("Welcome to Guenther's Market!");
		do {
			boolean validEntry = false;	
		do {
			Scanner insideLoop = new Scanner (System.in);
			menuPrinter();
			System.out.print("What item would you like to order?:");
			itemSelection = insideLoop.nextLine();
			if (menu.containsKey(itemSelection)) {
				validEntry = true;
				System.out.println("Adding " + itemSelection + " to cart at $" + (menu.get(itemSelection)));
				orderPrice.add(menu.get(itemSelection));
				orderItem.add(itemSelection);
			}else if (!menu.containsKey(itemSelection)) {
				System.out.println("That is not a valid entry.");
				validEntry = false;
			}
		}while (!validEntry);
		System.out.print("Continue shopping?(Y/N):");
		loopResponse  = userInput.next().charAt(0);
	}while (loopResponse == 'y'|| loopResponse == 'Y');
		System.out.println("Thanks for your order!");
		System.out.println("Here's what you got:");
		for (int i = 0; i < orderPrice.size(); i++) {
			System.out.printf("%-15s$%-15.2f\n",orderItem.get(i) ,orderPrice.get(i));
		}
		System.out.print("Average price per item in order was:");
		System.out.printf("%.2f", averagePrice(orderPrice));
		System.out.println("");
		highestItem(orderPrice);
		lowestItem(orderPrice);
	}
}