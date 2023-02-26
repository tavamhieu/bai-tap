import java.util.Scanner;

public class slide30 {
    
    public static void main(String[] args) {
        int n, Sodu ,tong =0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("nhap so nguyen duong bat ky :");
            n = scanner.nextInt();
        }
        while(n>0){
            Sodu =n%10;
            n =n/10;
            tong += Sodu;

        }
        System.out.println("tong cac chu so="+tong);   
      

  
    }
}

