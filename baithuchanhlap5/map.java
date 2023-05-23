package baithuchanhlap5;

import java.util.Scanner;

public class map {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("so phan tu cua mang la");
            int n = sc.nextInt();
            int arr[] = new int[n];
    
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("Nhap vao thu tu %d cua mang ", i);
                arr[i] = sc.nextInt();
            }
            
        }catch(Exception a){
            System.out.println("sai nhap lai tu dau");

        }finally{
            System.out.println("ket");
        }






        
    }
    
}
