package baithuchanh1804;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc{
    private String ten;
 
 
    private float dai,rong;
    private float chuvi,dientich;
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
    public float getchuvi(){
        return this.chuvi=chuvi;
      }
      public void setchhuvi(float s){
        this.chuvi=s;
      }
      public float getdientich(){
        return this.chuvi=chuvi;
      }
      public void setdientich(float c){
        this.chuvi=c;
      }


    
}
