import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        String hvt = " cuchuain";
        System.out.println("nhap so tuoi:");
        n= sc.nextInt();
        System.out.println("nhap ten :"+ hvt);
    

        if(n<16){
            System.out.println("ban"+hvt+"o tuoi vi thanh nien");

        }if(n>=16 || n<18){
            System.out.println("ban"+hvt+"o tuoi truong thamh");

        }else{
            System.out.println("ban"+hvt+"da lon");
        }
        
    }
    
}
