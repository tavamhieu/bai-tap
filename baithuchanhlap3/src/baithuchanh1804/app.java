package baithuchanh1804;

import java.util.Scanner;



public class danhba extends danhba1 {
  
public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);
    danhba1 A[];
    System.out.println("nhap phan tu cua mang :");
    int n = sc.nextInt();
    A = new danhba1 [n];
    sc.close();
    for(int i = 0;i< 7; i++){
        danhba1 db= new danhba1();
        db.nhapthongtin();
        A[i] = db;

    }
    for(int i=0 ; i< 7; i++){
        if(A[i].Fullname.equals("qlptu")){

        }


    }
    


    
   }
}
