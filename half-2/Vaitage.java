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
			System.out.println("Enter volume (maximum - " + f.mvolume + ")");
			number = numb.nextInt();
				while(number <= 0 || number > f.mvolume) {
					System.out.println("	Maximum volume is " + f.mvolume + ". Please enter again");
					System.out.println("Enter volume (maximum is " + f.mvolume + ")");
					number = numb.nextInt();
				}
			volume = number;
			System.out.println("----------");
			
			number = 0;
			System.out.println("Enter weight (maximum is " + f.mweight + ")");
			number = numb.nextInt();
				while(number <= 0 || number > f.mweight) {
					System.out.println("	Maximum volume is " + f.mweight + "!");
					System.out.println("Please Enter weight (maximum - " + f.mweight + ")");
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
			kv = volume/ f.mvolume;
			kw = weight / f.mweight;
			double k=0;
				if(kv >=kw) {k = k + kv;}
				if(kw >=kv) {k = k + kw;}
			price = km* f.fuelconsump * f.fuelprice * k;
			System.out.println("All calculated. It is worth: " + price + "UAH");
			
		//System.out.println("Fura volume: " + maxfura.getVolume());
		//System.out.println("Fura weight: " + maxfura.getWeight());
		//System.out.println("Calculated: ");
		//System.out.println("It will cost: " + calculate);
}
	//public static int Calculate (int calculate) {return calculate;}
}
