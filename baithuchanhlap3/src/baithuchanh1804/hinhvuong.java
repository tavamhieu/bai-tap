package baithuchanh1804;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    private String ten;
    public float canh;
    private float chuvi,dientich;
    public hinhvuong(){
        ten= "hinh vuong";
    }
    
        
    
    public void nhapthongtin(){
        Scanner sc = new Scanner( System.in);
       
        System.out.println("canh hinh la :");
        canh=sc.nextFloat();
        sc.close(); 
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
