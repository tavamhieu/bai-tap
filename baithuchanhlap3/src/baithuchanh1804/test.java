package baithuchanh1804;

import java.util.Scanner;

public class test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hinhhoc hh = new hinhhoc();
        System.out.println("ten =" +hh.getten());
        hh.setten("em ak");
        System.out.println("ten= "+ hh.getten());


        System.out.println("chu vi la "+ hh.getchuvi());
        hh.setchuvi(6);
        System.out.println("chu vi = "+ hh.getchuvi());
        
        
        
        
       
    }
    
}
