package zlab2;

public class Main {
    public static void main(String[] args) {
            /*class Forsquare{
                int dovzhina = 15;
                int shirota = 10;
                int square = dovzhina * shirota;
                    public int getSquare(){
                        return square;
                    }
                
            }
            class Prism extends Forsquare{
                protected int vysota = 20;
                int volume = p.dovzhina * p.shirota * p.vysota;
                    public int getVolume(){
                        return volume;
                    }
            } */
            foursquare f = new foursquare();
            Prism p = new Prism();
        
        System.out.println("Foursquare is: " + f.getSquare());
        System.out.println("Prism square is: " + p.getSquare());
    }
}
