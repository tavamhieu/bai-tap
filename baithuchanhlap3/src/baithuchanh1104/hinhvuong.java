package baithuchanh1104;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    public float canh;
    public hinhvuong(){
        ten= "hinh vuong";
    }
    
        
    
    public void nhapthongtin(){
        Scanner sc = new Scanner( System.in);
       
        System.out.println("canh hinh la :");
        canh=sc.nextFloat();
        sc.close(); 
    }
    
}
