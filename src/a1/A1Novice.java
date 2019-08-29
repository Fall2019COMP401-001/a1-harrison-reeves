package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Integer count of number of customers
		
		int count = scan.nextInt();
		
		
		// array of customer data
		double total = 0.0;
				
		for (int i=0; i<count; i++) {
			String first = scan.next();
			String last = scan.next();
			int number_of_items = scan.nextInt();
			for (int q=0; q<number_of_items; q++) {
				int quantity_of_item = scan.nextInt();
				String name_of_item = scan.next();
				double price_of_item = scan.nextDouble();
				double item_total_price = quantity_of_item * price_of_item;
				total = total + item_total_price;
			}
			
			System.out.println(first.substring(0,1) + ". " + last + ": " + String.format("%.2f", ((double) total) ));
			
			total = 0;
			

		
		} 
		
		
		scan.close();
		
		
	}
	
	
}


