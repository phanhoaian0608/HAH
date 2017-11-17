package PropertyAndChance;
import java.util.Random;

public class RunPropertyAndChance extends PropertyAndChance{
    
    public static void main(String[] args) {
        int rd = random1(1,28);
        if (rd==1) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro1);
        }
        else if (rd==2) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro2);
        }
        else if (rd==3) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro3);
        }
        else if (rd==4) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro4);
        }
        else if (rd==5) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro5);
        }
        else if (rd==6) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro6);
        }
        else if (rd==7) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro7);
        }
        else if (rd==8) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro8);
        }
        else if (rd==9) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro9);
        }
        else if (rd==10) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro10);
        }
        else if (rd==11) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro11);
        }
        else if (rd==12) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro12);
        }
        else if (rd==13) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro13);
        }
        else if (rd==14) {
            System.out.println("PROPERTY");
            System.out.println(Property.Pro14);
        }
        else if (rd==15) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha1);
        }
        else if (rd==16) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha2);
        }
        else if (rd==17) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha3);
        }
        else if (rd==18) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha4);
        }
        else if (rd==19) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha5);
        }
        else if (rd==20) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha6);
        }
        else if (rd==21) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha7);
        }
        else if (rd==22) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha8);
        }
        else if (rd==23) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha9);
        }
        else if (rd==24) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha10);
        }
        else if (rd==25) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha11);
        }
        else if (rd==26) {
            System.out.println("CHANCE");
            System.out.println((Chance.Cha12));
        }
        else if (rd==27) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha13);
        }
        else if (rd==28) {
            System.out.println("CHANCE");
            System.out.println(Chance.Cha14);
        }
    }
    
    public static int random1(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
}
     
    
    
