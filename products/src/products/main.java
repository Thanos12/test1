package products;

import java.util.Scanner;

class Product{
	
	//class attributes
	private String name;
	private double price;
	private int score;
	
	public Product() {
		name = "";
		score = 0;
		price = 1;
		
	}
	
	public void printData() {
		System.out.println("Name:" + name);
		System.out.println("Price: " + price);
		System.out.println("Score: " + score);
	}
	
	public void read() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("product name");
		name = in.nextLine();
		System.out.println("Price:");
		price = in.nextDouble();
		System.out.println("Score:");
		score = in.nextInt();
	}
	
	public boolean is_better_than(Product other) {
		
		if(score/price > other.score/other.price)
			return true;
		else
			return false;
		
	}
	
}

public class main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Product best = new Product();
		
		boolean more = true;
		while(more) {
			
			Product current = new Product();
			
			
			// κληση της μεθοδου rea επι του αντικ. current
			//αποστολη μηνυματος read στο αντικ. current
			current.read();
			
			if(current.is_better_than(best)) {
				best = current;
			}
			
			//test git 3
			
			System.out.println("More Products? 1:YES, 2:NO");
			int answer = in.nextInt();
			if(answer != 1)
				more = false;
			in.nextLine();
		}	
			
		
		best.printData();
	}

}
