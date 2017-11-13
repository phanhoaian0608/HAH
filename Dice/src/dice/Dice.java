package dice;
import java.util.Random;

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





       // System.out.println(random2);
      /*  int random1 = random1(0,6);
        int random2 = random2(0,6);
        System.out.println(random1);
        System.out.println(random2);*/
    
    /*
    public static int random1 (int min, int max) {
        try {
            Random rd = new Random ();
            int range = max - min+1;
            int randomN = min + rd.nextInt(range);
            return randomN;
        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
    
    public static int random2 (int min, int max) {
        try {
            Random rd = new Random ();
            int range = max - min+1;
            int randomN = min + rd.nextInt(range);
            return randomN;
        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }*/
    

