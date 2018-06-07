import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        IPizzaFactory newYorkPizza = new NewYorkPizza();
        IPizzaFactory chicagoPizza = new ChicagoPizza();

        System.out.println("Where are you located? \n NewYork \n Chicago");
        String located = scanner.next();
        if (located.equals("newYork") || located.equals("NewYork")){
            System.out.println("Which pizza you order? \n Carbonara  \n Gavai");
            String pizza = scanner.next();
            if (pizza.equals("carbonara") || pizza.equals("Carbonara")){
                newYorkPizza.createPizza("Carbonara");
            }
            else if (pizza.equals("gavai")|| pizza.equals("Gavai")){
                newYorkPizza.createPizza("Gavai");
            }
            else
                System.out.println("Error");

        }
        else if (located.equals("chicago") || located.equals("Chicago")){
            System.out.println("Which pizza would you like to order? \n Carbonara  \n Gavai");
            String pizza = scanner.next();
            if (pizza.equals("carbonara") || pizza.equals("Carbonara")){
                chicagoPizza.createPizza("Carbonara");
            }
            else if (pizza.equals("gavai")|| pizza.equals("Gavai")){
                chicagoPizza.createPizza("Gavai");
            }
            else
                System.out.println("Error");
        }
        else
            System.out.println("Error");

    }
}
