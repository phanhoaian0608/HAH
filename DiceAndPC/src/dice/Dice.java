package dice;
import java.util.Random;
import java.awt.event.*;

public class Dice {
    
    public static void main(String[] args) {
        System.out.println(random1(1, 6));
        System.out.println(random1(1, 6));
    }
    
    public static int random1(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
}
    

