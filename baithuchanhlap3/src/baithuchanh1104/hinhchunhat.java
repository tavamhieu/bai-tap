package baithuchanh1104;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc{
    public float dai,rong;
    public hinhchunhat(){
        ten="hinh chu nhat";
    }
    public void  nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("chieu dai la:");
        dai=sc.nextFloat();
        System.out.println("chieu rong la :");
        rong=sc.nextFloat();


    }
    public void chuvila(){
        chuvi=(dai+rong)*2;
    }
    public void dientichla(){
        dientich= dai*rong;
    }


    
}
