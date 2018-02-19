package zlab1;
import java.util.Scanner;

public class Vaitage {
	public static void main(String[] args){
		Scanner numb = new Scanner(System.in);
		Fura f = new Fura();
			double number;
			
			double volume = 0, kv;
			double weight = 0, kw;
			double km = 0;
			double price = 0.00;
			
			number = 0;
			System.out.println("----------");
			System.out.println("Enter volume (maximum - " + f.getMvolume() + ")");
			number = numb.nextInt();
				while(number <= 0 || number > f.getMvolume()) {
					System.out.println("	Maximum volume is " + f.getMvolume() + ". Please enter again");
					System.out.println("Enter volume (maximum is " + f.getMvolume() + ")");
					number = numb.nextInt();
				}
			volume = number;
			System.out.println("----------");
			
			number = 0;
			System.out.println("Enter weight (maximum is " + f.getMweight() + ")");
			number = numb.nextInt();
				while(number <= 0 || number > f.getMweight()) {
					System.out.println("	Maximum volume is " + f.getMweight() + "!");
					System.out.println("Please Enter weight (maximum - " + f.getMweight() + ")");
					number = numb.nextInt();
				}
			weight = number;
			System.out.println("----------");
			
			number = 0;
			System.out.println("Enter km: ");
			number = numb.nextInt();
				while(number <= 0) {
					System.out.println("Please enter km again: ");
					number = numb.nextInt();
				}
				System.out.println("-Calculation-");
			km = number;
			
			//Âèçíà÷àºì ÿêèé êå-ô á³ëüøå
			kv = volume/ f.getMvolume();
			kw = weight / f.getMweight();
			double k=0;
				if(kv >=kw) {k = k + kv;}
				if(kw >=kv) {k = k + kw;}
			price = km* f.getFuelconsump() * f.getFuelprice() * k;
			System.out.print("All calculated. It is worth: ");
			System.out.printf("%.2f", price);
			System.out.printf("UAH");
}
}
