import java.util.Scanner;
public class lab1 {
 public static void main(String[] args) {
	System.out.println(" ");
	String s = "hello my world";
	System.out.println("Rechennya: " + s);
 
  char[] chars = s.toCharArray();
  

  
  int n=0; //порядковий номер масива slovo
  int ls=1; //Довжина масива slovo
  char prob = ' ';
  char point = '.';
  
  
  
  //Цикл для показу довжини масиву slova
  for(int k=0; k<chars.length; k++ ) {
   if(chars[k]== prob) {
    ls++; //Показує що слів є більше ніж 1
   }
   if(chars[k]== point) {
	    ls++; //Показує що слів є більше ніж 1
	   }
  }
  
  
  
  System.out.println("K-st symvoliv v zadannomy rechenni: " + chars.length);
  System.out.println("K-st sliv: " + ls);
  System.out.println(" ");
  
  
  
  int d[] = new int[ls]; //Створюємо масив з порядкових номерів слова
  //Цей цикл присвоює всім d = 0
  for(int di = 0; di<ls ;di++){
	  d[di] = 0;
  }
  
  
  
  String slovo[] = new String[ls];	//Створюємо новий масив слів
  //Цей цикл додає кожний наступний символ до слова, а як побаче що символ = пробілу, то символи додаються до наступного слова
   for(int i=0; i<chars.length; i++ ) {
	if(chars[i] == prob){ //Якщо наступний символ
     n++;
	 slovo[n] = " "; //Це вказана приставка до кожного слова, відсутність її створить приставку null біля кожного слова
    }
	if(chars[i] != prob){
		if(i==0){
		slovo[n] = " "; //+/-
	}
     for(int e=0; e<1; e++) {
      slovo[n] = slovo[n] + chars[i]; //додавати кожний наступний символ до слова
	  d[n] = d[n] + 1; //Кількість символів тепер більша
     }
    }
   } //Закриваюча циклу
   
   
   
	System.out.println("Vvedit_ bukvu shchob vyvesty pershe slovo z neyu !");
		//Scanner scb = new Scanner(System.in);
		//char b = scb.nextChar();
		char b = 'y'; //Задати букву
		System.out.println("Vvedena bukva: " + b);
		//Цикл який виводить перше слово з введенною буквою
		int N;
		N = 0;
		int rn =0;
		for(int h = 0; h<slovo.length; h++){ //Цикл залежний від кількості слів
			String sb = slovo[h];
			char[] charsb = sb.toCharArray();
			int j;
			j = h+1;
			for(int f =0; f < charsb.length; f++){ //Цикл залежний від кількості символів в слові
				if(charsb[f] == b){
						rn++;
						if(rn ==1){
							System.out.println("Slovo z bukvoyu '" + b + "' e ");
							System.out.println("Slovo #" + j + "  - " + slovo[h]);
							System.out.println("Ce slovo mae dovzhynu " + d[h] + " symv.");
						}
					}	
			}
		}
  System.out.println("Dyaki za uvagu :D");
}
}