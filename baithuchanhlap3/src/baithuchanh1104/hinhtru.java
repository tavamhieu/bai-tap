package baithuchanh1104;

import java.util.Scanner;

public class hinhtru extends hinhtron{
    public float h;
    public hinhtru(){
        ten="hinh tru";
    }
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu cao la:");
        h=sc.nextFloat();
       
        sc.close();
        
    }
    public void tinhthetich(){
        thetich=h*dientich;
    }


    
}
